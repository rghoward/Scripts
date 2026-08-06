package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class l2<T> implements KSerializer<T> {
    public sy2<T> a(rt1 rt1Var, String str) {
        return rt1Var.k().O0(c(), str);
    }

    public ud9<T> b(Encoder encoder, T t) {
        t.getClass();
        return encoder.k().P0(c(), t);
    }

    public abstract wn5<T> c();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.sy2
    public final T deserialize(Decoder decoder) {
        SerialDescriptor descriptor = getDescriptor();
        rt1 rt1VarN = decoder.n(descriptor);
        gl8 gl8Var = new gl8();
        T t = null;
        while (true) {
            int iG0 = rt1VarN.g0(getDescriptor());
            if (iG0 == -1) {
                if (t != null) {
                    rt1VarN.i(descriptor);
                    return t;
                }
                r.a((String) gl8Var.t, "Polymorphic value has not been read for class ");
                return null;
            }
            if (iG0 != 0) {
                T t2 = gl8Var.t;
                if (iG0 != 1) {
                    StringBuilder sb = new StringBuilder("Invalid index in polymorphic deserialization of ");
                    String str = (String) t2;
                    if (str == null) {
                        str = "unknown class";
                    }
                    sb.append(str);
                    sb.append("\n Expected 0, 1 or DECODE_DONE(-1), but found ");
                    sb.append(iG0);
                    throw new td9(sb.toString());
                }
                if (t2 == 0) {
                    z90.a("Cannot read polymorphic value before its type token");
                    return null;
                }
                gl8Var.t = t2;
                t = (T) rt1VarN.J(getDescriptor(), iG0, sm3.f(this, rt1VarN, (String) t2), null);
            } else {
                gl8Var.t = (T) rt1VarN.c0(getDescriptor(), iG0);
            }
        }
    }

    @Override // defpackage.ud9
    public final void serialize(Encoder encoder, T t) {
        t.getClass();
        ud9<? super T> ud9VarG = sm3.g(this, encoder, t);
        SerialDescriptor descriptor = getDescriptor();
        st1 st1VarN = encoder.n(descriptor);
        st1VarN.p(getDescriptor(), 0, ud9VarG.getDescriptor().a());
        st1VarN.q(getDescriptor(), 1, ud9VarG, t);
        st1VarN.i(descriptor);
    }
}
