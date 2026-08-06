package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class f31 implements idb, jac {
    public static final float[][] t = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};
    public static final float[][] u = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};
    public static final float[] v = {95.047f, 100.0f, 108.883f};
    public static final float[][] w = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};
    public static final /* synthetic */ f31 x = new f31();

    public static String i(e01 e01Var) {
        StringBuilder sb = new StringBuilder(e01Var.size());
        for (int i = 0; i < e01Var.size(); i++) {
            byte bD = e01Var.d(i);
            if (bD == 34) {
                sb.append("\\\"");
            } else if (bD == 39) {
                sb.append("\\'");
            } else if (bD != 92) {
                switch (bD) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case z97.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case z97.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                        sb.append("\\r");
                        break;
                    default:
                        if (bD < 32 || bD > 126) {
                            sb.append('\\');
                            sb.append((char) (((bD >>> 6) & 3) + 48));
                            sb.append((char) (((bD >>> 3) & 7) + 48));
                            sb.append((char) ((bD & 7) + 48));
                        } else {
                            sb.append((char) bD);
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static int j(float f) {
        if (f < 1.0f) {
            return -16777216;
        }
        if (f > 99.0f) {
            return -1;
        }
        float f2 = (f + 16.0f) / 116.0f;
        float f3 = f > 8.0f ? f2 * f2 * f2 : f / 903.2963f;
        float f4 = f2 * f2 * f2;
        boolean z = f4 > 0.008856452f;
        float f5 = z ? f4 : ((f2 * 116.0f) - 16.0f) / 903.2963f;
        if (!z) {
            f4 = ((f2 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = v;
        return vi1.b(f5 * fArr[0], f3 * fArr[1], f4 * fArr[2]);
    }

    public static float k(int i) {
        float f = i / 255.0f;
        return (f <= 0.04045f ? f / 12.92f : (float) Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    public static float l() {
        return ((float) Math.pow(0.5689655172413793d, 3.0d)) * 100.0f;
    }

    @Override // defpackage.jac
    public Object a() {
        List list = wfc.a;
        return Integer.valueOf((int) u4c.u.get().K());
    }

    @Override // defpackage.idb
    public int c() {
        return 0;
    }

    @Override // defpackage.idb
    public int f() {
        return 0;
    }

    @Override // defpackage.edb
    public fw g(long j, fw fwVar, fw fwVar2, fw fwVar3) {
        return j < 0 ? fwVar : fwVar2;
    }

    @Override // defpackage.edb
    public fw e(long j, fw fwVar, fw fwVar2, fw fwVar3) {
        return fwVar3;
    }
}
