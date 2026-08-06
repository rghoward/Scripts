package defpackage;

import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class hu1 implements jac {
    public static final float v = 24.0f;
    public static final float w = 24.0f;
    public static final Object t = new Object();
    public static final au3 u = new au3(new j19(), new mc3(2));
    public static final /* synthetic */ hu1 x = new hu1();

    public static final Object[] b(Object[] objArr, int i, Object obj, Object obj2) {
        Object[] objArr2 = new Object[objArr.length + 2];
        gz3.i(0, i, 6, objArr, objArr2);
        gz3.f(i + 2, i, objArr.length, objArr, objArr2);
        objArr2[i] = obj;
        objArr2[i + 1] = obj2;
        return objArr2;
    }

    public static final Object[] c(int i, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 2];
        gz3.i(0, i, 6, objArr, objArr2);
        gz3.f(i, i + 2, objArr.length, objArr, objArr2);
        return objArr2;
    }

    public static final Object[] d(int i, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 1];
        gz3.i(0, i, 6, objArr, objArr2);
        gz3.f(i, i + 1, objArr.length, objArr, objArr2);
        return objArr2;
    }

    public static final void e(Encoder encoder) {
        encoder.getClass();
        if ((encoder instanceof y1a ? (y1a) encoder : null) != null) {
            return;
        }
        v92.b(ll8.a(encoder.getClass()), "This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got ");
    }

    public static final em5 f(Decoder decoder) {
        decoder.getClass();
        em5 em5Var = decoder instanceof em5 ? (em5) decoder : null;
        if (em5Var != null) {
            return em5Var;
        }
        v92.b(ll8.a(decoder.getClass()), "This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got ");
        return null;
    }

    public static final int g(int i, int i2) {
        return (i >> i2) & 31;
    }

    @Override // defpackage.jac
    public Object a() {
        return new Boolean(((a6c) z5c.u.t.t).a());
    }
}
