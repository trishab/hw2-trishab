package edu.cmu.deiis.annotators;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.jcas.JCas;
import org.apache.uima.cas.FSIndex;
import org.apache.uima.tutorial.RoomNumber;

import edu.cmu.deiis.types.Token;

public class TokenAnnotator2 extends JCasAnnotator_ImplBase {
 private Pattern TokenPattern = Pattern.compile("[a-zA-z']+");


	@Override
	public void process(JCas aJCas) throws AnalysisEngineProcessException {
		// TODO Auto-generated method stub
		String docText = aJCas.getDocumentText();
	    // search for Tokens
	    Matcher matcher = TokenPattern.matcher(docText);
	    while (matcher.find()) {
	      // found one - create annotation
	      if (!matcher.group().equals("A") && !matcher.group().equals("Q")
	              && !matcher.group().equals("1") && !matcher.group().equals("0")
	              && !matcher.group().equals("/n")) {
	        Token annotation = new Token(aJCas);

	        annotation.setBegin(matcher.start());
	        annotation.setEnd(matcher.end());
	        annotation.setConfidence(1);
	        annotation.setCasProcessorId("TokenAnnotator");
	        annotation.addToIndexes();
	}
	    }
	    
	    FSIndex tokenIndex = aJCas.getAnnotationIndex(Token.type);
	}
}


