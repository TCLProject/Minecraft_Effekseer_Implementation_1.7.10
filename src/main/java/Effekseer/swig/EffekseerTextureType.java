/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package Effekseer.swig;

@SuppressWarnings({"unused", "RedundantSuppression"})
public final class EffekseerTextureType {
  public final static EffekseerTextureType Color = new EffekseerTextureType("Color");
  public final static EffekseerTextureType Normal = new EffekseerTextureType("Normal");
  public final static EffekseerTextureType Distortion = new EffekseerTextureType("Distortion");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static EffekseerTextureType swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    // was originally a normal fori loop
    for (EffekseerTextureType value : swigValues)
      if (value.swigValue == swigValue)
        return value;
    throw new IllegalArgumentException("No enum " + EffekseerTextureType.class + " with value " + swigValue);
  }

  private EffekseerTextureType(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private EffekseerTextureType(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private EffekseerTextureType(String swigName, EffekseerTextureType swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static final EffekseerTextureType[] swigValues = { Color, Normal, Distortion }; // was originally non-final
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}
