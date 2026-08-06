package defpackage;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.os.Build;
import android.util.DisplayMetrics;
import java.util.Arrays;
import java.util.function.DoubleUnaryOperator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class bx {
    public static final Bitmap a(int i, int i2, int i3, ii1 ii1Var) {
        ColorSpace rgb;
        ColorSpace rgb2;
        ColorSpace colorSpaceA;
        ColorSpace colorSpace;
        Bitmap.Config configB = so.b(i3);
        if (xj5.a(ii1Var, si1.e)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
        } else if (xj5.a(ii1Var, si1.q)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.ACES);
        } else if (xj5.a(ii1Var, si1.r)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.ACESCG);
        } else if (xj5.a(ii1Var, si1.o)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.ADOBE_RGB);
        } else if (xj5.a(ii1Var, si1.j)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.BT2020);
        } else if (xj5.a(ii1Var, si1.i)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.BT709);
        } else if (xj5.a(ii1Var, si1.t)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.CIE_LAB);
        } else if (xj5.a(ii1Var, si1.s)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.CIE_XYZ);
        } else if (xj5.a(ii1Var, si1.k)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.DCI_P3);
        } else if (xj5.a(ii1Var, si1.l)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.DISPLAY_P3);
        } else if (xj5.a(ii1Var, si1.g)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.EXTENDED_SRGB);
        } else if (xj5.a(ii1Var, si1.h)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
        } else if (xj5.a(ii1Var, si1.f)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.LINEAR_SRGB);
        } else if (xj5.a(ii1Var, si1.m)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.NTSC_1953);
        } else {
            if (!xj5.a(ii1Var, si1.p)) {
                if (xj5.a(ii1Var, si1.n)) {
                    colorSpace = ColorSpace.get(ColorSpace.Named.SMPTE_C);
                } else if (Build.VERSION.SDK_INT < 34 || (colorSpaceA = ni1.a(ii1Var)) == null) {
                    if (ii1Var instanceof lw8) {
                        String str = ii1Var.a;
                        lw8 lw8Var = (lw8) ii1Var;
                        float[] fArrA = lw8Var.d.a();
                        zua zuaVar = lw8Var.g;
                        ColorSpace.Rgb.TransferParameters transferParameters = zuaVar != null ? new ColorSpace.Rgb.TransferParameters(zuaVar.b, zuaVar.c, zuaVar.d, zuaVar.e, zuaVar.f, zuaVar.g, zuaVar.a) : null;
                        float[] fArr = lw8Var.i;
                        if (transferParameters != null) {
                            ColorSpace.Rgb rgb3 = new ColorSpace.Rgb(str, lw8Var.h, fArrA, transferParameters);
                            if (Float.isNaN(fArr[0]) || Arrays.equals(rgb3.getTransform(), fArr)) {
                                rgb2 = rgb3;
                            } else {
                                rgb = new ColorSpace.Rgb(str, fArr, transferParameters);
                            }
                        } else {
                            float[] fArr2 = lw8Var.h;
                            final lw8.c cVar = lw8Var.l;
                            DoubleUnaryOperator doubleUnaryOperator = new DoubleUnaryOperator() { // from class: ki1
                                @Override // java.util.function.DoubleUnaryOperator
                                public final double applyAsDouble(double d) {
                                    return ((Number) cVar.invoke(Double.valueOf(d))).doubleValue();
                                }
                            };
                            final lw8.b bVar = lw8Var.o;
                            rgb2 = new ColorSpace.Rgb(str, fArr2, fArrA, doubleUnaryOperator, new DoubleUnaryOperator() { // from class: li1
                                @Override // java.util.function.DoubleUnaryOperator
                                public final double applyAsDouble(double d) {
                                    return ((Number) bVar.invoke(Double.valueOf(d))).doubleValue();
                                }
                            }, lw8Var.e, lw8Var.f);
                        }
                    } else {
                        configB = configB;
                        rgb = ColorSpace.get(ColorSpace.Named.SRGB);
                    }
                    rgb2 = rgb;
                } else {
                    rgb2 = colorSpaceA;
                    configB = configB;
                }
                return Bitmap.createBitmap((DisplayMetrics) null, i, i2, configB, true, rgb2);
            }
            colorSpace = ColorSpace.get(ColorSpace.Named.PRO_PHOTO_RGB);
        }
        rgb2 = colorSpace;
        configB = configB;
        return Bitmap.createBitmap((DisplayMetrics) null, i, i2, configB, true, rgb2);
    }
}
