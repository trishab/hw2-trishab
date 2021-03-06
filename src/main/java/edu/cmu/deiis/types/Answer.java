

/* First created by JCasGen Wed Sep 11 13:44:28 EDT 2013 */
package edu.cmu.deiis.types;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



import org.apache.uima.jcas.cas.FSArray;
import org.apache.uima.jcas.cas.TOP;


/** 
 * Updated by JCasGen Mon Nov 11 10:32:52 EST 2013
 * XML source: C:/Users/trishab/git/hw2-trishab/src/main/resources/descriptors/deiis_types.xml
 * @generated */
public class Answer extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Answer.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated  */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected Answer() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Answer(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Answer(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Answer(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: isCorrect

  /** getter for isCorrect - gets 
   * @generated */
  public boolean getIsCorrect() {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_isCorrect == null)
      jcasType.jcas.throwFeatMissing("isCorrect", "edu.cmu.deiis.types.Answer");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((Answer_Type)jcasType).casFeatCode_isCorrect);}
    
  /** setter for isCorrect - sets  
   * @generated */
  public void setIsCorrect(boolean v) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_isCorrect == null)
      jcasType.jcas.throwFeatMissing("isCorrect", "edu.cmu.deiis.types.Answer");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((Answer_Type)jcasType).casFeatCode_isCorrect, v);}    
   
    
  //*--------------*
  //* Feature: sentenceArray

  /** getter for sentenceArray - gets 
   * @generated */
  public FSArray getSentenceArray() {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_sentenceArray == null)
      jcasType.jcas.throwFeatMissing("sentenceArray", "edu.cmu.deiis.types.Answer");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Answer_Type)jcasType).casFeatCode_sentenceArray)));}
    
  /** setter for sentenceArray - sets  
   * @generated */
  public void setSentenceArray(FSArray v) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_sentenceArray == null)
      jcasType.jcas.throwFeatMissing("sentenceArray", "edu.cmu.deiis.types.Answer");
    jcasType.ll_cas.ll_setRefValue(addr, ((Answer_Type)jcasType).casFeatCode_sentenceArray, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for sentenceArray - gets an indexed value - 
   * @generated */
  public Sentence getSentenceArray(int i) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_sentenceArray == null)
      jcasType.jcas.throwFeatMissing("sentenceArray", "edu.cmu.deiis.types.Answer");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Answer_Type)jcasType).casFeatCode_sentenceArray), i);
    return (Sentence)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Answer_Type)jcasType).casFeatCode_sentenceArray), i)));}

  /** indexed setter for sentenceArray - sets an indexed value - 
   * @generated */
  public void setSentenceArray(int i, Sentence v) { 
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_sentenceArray == null)
      jcasType.jcas.throwFeatMissing("sentenceArray", "edu.cmu.deiis.types.Answer");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Answer_Type)jcasType).casFeatCode_sentenceArray), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Answer_Type)jcasType).casFeatCode_sentenceArray), i, jcasType.ll_cas.ll_getFSRef(v));}
  }

    