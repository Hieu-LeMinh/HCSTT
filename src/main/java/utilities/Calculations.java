package utilities;

import java.util.ArrayList;

import model.PictureFuzzyRelation;

public interface Calculations {
  
  /**Calculate Degree of positive membership.
   * @param pFrArray1 input array
   * @param pFrArray2 input array
   * @param a array index
   * @param b array index
   * @param length array length
   * @return degree of positive membership
   */
  public float calDoPositiveM(ArrayList<ArrayList<PictureFuzzyRelation>> pFrArray1, ArrayList<ArrayList<PictureFuzzyRelation>> pFrArray2, int a, int b, int length);
  
  /**Calculate Degree of neutral membership.
   * @param pFrArray1 input array
   * @param pFrArray2 input array
   * @param a array index
   * @param b array index
   * @param length array length
   * @return degree of neutral membership
   */
  public float calDoNeutralM(ArrayList<ArrayList<PictureFuzzyRelation>> pFrArray1, ArrayList<ArrayList<PictureFuzzyRelation>> pFrArray2, int a, int b, int length);
  
  /**Calculate Degree of negative membership.
   * @param pFrArray1 input array
   * @param pFrArray2 input array
   * @param a array index
   * @param b array index
   * @param length array length
   * @return degree of negative membership
   */
  public float calDoNegativeM(ArrayList<ArrayList<PictureFuzzyRelation>> pFrArray1, ArrayList<ArrayList<PictureFuzzyRelation>> pFrArray2, int a, int b, int length);
  
  /**Calculate Degree of refusal membership.
   * @param pFrArray1 input array
   * @param pFrArray2 input array
   * @param a array index
   * @param b array index
   * @param length array length
   * @return degree of refusal membership
   */
  public float calDoRefusalM(ArrayList<ArrayList<PictureFuzzyRelation>> pFrArray1, ArrayList<ArrayList<PictureFuzzyRelation>> pFrArray2, int a, int b, int length);
  
  /**Calculate S from Degrees
   * @param u degree of positive membership
   * @param n degree of refusal membership
   * @param v degree of negative membership
   * @return s
   */
  public float calS(float u, float n, float v);
}
