package defpackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class u78 implements wd9<t78> {
    public static final u78 a = new u78();

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[y78.b.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[6] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[2] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[3] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[4] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[5] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[7] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[8] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            a = iArr;
        }
    }

    @Override // defpackage.wd9
    public final t78 a() {
        return new x27(1, true);
    }

    @Override // defpackage.wd9
    public final g2b b(Object obj, s1b s1bVar) throws IOException {
        y78 y78VarE;
        Map<t78.a<?>, Object> mapA = ((t78) obj).a();
        w78.a aVarS = w78.s();
        for (Map.Entry<t78.a<?>, Object> entry : mapA.entrySet()) {
            t78.a<?> key = entry.getKey();
            Object value = entry.getValue();
            String str = key.a;
            if (value instanceof Boolean) {
                y78.a aVarI = y78.I();
                boolean zBooleanValue = ((Boolean) value).booleanValue();
                aVarI.g();
                y78.v((y78) aVarI.u, zBooleanValue);
                y78VarE = aVarI.e();
            } else if (value instanceof Float) {
                y78.a aVarI2 = y78.I();
                float fFloatValue = ((Number) value).floatValue();
                aVarI2.g();
                y78.w((y78) aVarI2.u, fFloatValue);
                y78VarE = aVarI2.e();
            } else if (value instanceof Double) {
                y78.a aVarI3 = y78.I();
                double dDoubleValue = ((Number) value).doubleValue();
                aVarI3.g();
                y78.s((y78) aVarI3.u, dDoubleValue);
                y78VarE = aVarI3.e();
            } else if (value instanceof Integer) {
                y78.a aVarI4 = y78.I();
                int iIntValue = ((Number) value).intValue();
                aVarI4.g();
                y78.x((y78) aVarI4.u, iIntValue);
                y78VarE = aVarI4.e();
            } else if (value instanceof Long) {
                y78.a aVarI5 = y78.I();
                long jLongValue = ((Number) value).longValue();
                aVarI5.g();
                y78.p((y78) aVarI5.u, jLongValue);
                y78VarE = aVarI5.e();
            } else if (value instanceof String) {
                y78.a aVarI6 = y78.I();
                aVarI6.g();
                y78.q((y78) aVarI6.u, (String) value);
                y78VarE = aVarI6.e();
            } else if (value instanceof Set) {
                y78.a aVarI7 = y78.I();
                x78.a aVarT = x78.t();
                aVarT.g();
                x78.q((x78) aVarT.u, (Set) value);
                aVarI7.g();
                y78.r((y78) aVarI7.u, aVarT.e());
                y78VarE = aVarI7.e();
            } else {
                if (!(value instanceof byte[])) {
                    aa0.c("PreferencesSerializer does not support type: ".concat(value.getClass().getName()));
                    return null;
                }
                y78.a aVarI8 = y78.I();
                byte[] bArr = (byte[]) value;
                e01.f fVarF = e01.f(bArr, 0, bArr.length);
                aVarI8.g();
                y78.t((y78) aVarI8.u, fVarF);
                y78VarE = aVarI8.e();
            }
            aVarS.getClass();
            str.getClass();
            aVarS.g();
            w78.q((w78) aVarS.u).put(str, y78VarE);
        }
        w78 w78VarE = aVarS.e();
        int iF = w78VarE.f(null);
        Logger logger = sg1.y;
        if (iF > 4096) {
            iF = 4096;
        }
        sg1.d dVar = new sg1.d(s1bVar, iF);
        w78VarE.d(dVar);
        if (dVar.C > 0) {
            dVar.R1();
        }
        return g2b.a;
    }

    @Override // defpackage.wd9
    public final Object c(FileInputStream fileInputStream) throws z72 {
        byte[] bArr;
        try {
            w78 w78VarT = w78.t(fileInputStream);
            x27 x27Var = new x27(1, false);
            t78.b[] bVarArr = (t78.b[]) Arrays.copyOf(new t78.b[0], 0);
            x27Var.e();
            if (bVarArr.length > 0) {
                bVarArr[0].getClass();
                x27Var.h(null, null);
                throw null;
            }
            Map<String, y78> mapR = w78VarT.r();
            mapR.getClass();
            for (Map.Entry<String, y78> entry : mapR.entrySet()) {
                String key = entry.getKey();
                y78 value = entry.getValue();
                key.getClass();
                value.getClass();
                y78.b bVarH = value.H();
                switch (bVarH == null ? -1 : a.a[bVarH.ordinal()]) {
                    case -1:
                        throw new z72("Value case is null.", null);
                    case 0:
                    default:
                        u.b();
                        return null;
                    case 1:
                        x27Var.h(new t78.a<>(key), Boolean.valueOf(value.y()));
                        break;
                    case 2:
                        x27Var.h(new t78.a<>(key), Float.valueOf(value.C()));
                        break;
                    case 3:
                        x27Var.h(new t78.a<>(key), Double.valueOf(value.B()));
                        break;
                    case 4:
                        x27Var.h(new t78.a<>(key), Integer.valueOf(value.D()));
                        break;
                    case 5:
                        x27Var.h(new t78.a<>(key), Long.valueOf(value.E()));
                        break;
                    case 6:
                        x27Var.h(new t78.a<>(key), value.F());
                        break;
                    case 7:
                        t78.a<?> aVar = new t78.a<>(key);
                        xi5.c cVarS = value.G().s();
                        cVarS.getClass();
                        x27Var.h(aVar, th1.X(cVarS));
                        break;
                    case 8:
                        t78.a<?> aVar2 = new t78.a<>(key);
                        e01 e01VarZ = value.z();
                        int size = e01VarZ.size();
                        if (size == 0) {
                            bArr = xi5.b;
                        } else {
                            byte[] bArr2 = new byte[size];
                            e01VarZ.i(bArr2, size);
                            bArr = bArr2;
                        }
                        x27Var.h(aVar2, bArr);
                        break;
                    case 9:
                        throw new z72("Value not set.", null);
                }
            }
            return x27Var.d();
        } catch (fk5 e) {
            throw new z72("Unable to parse preferences proto.", e);
        }
    }
}
