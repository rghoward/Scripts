package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class hya<A, B, C> implements KSerializer<gya<? extends A, ? extends B, ? extends C>> {
    public final KSerializer<A> a;
    public final KSerializer<B> b;
    public final KSerializer<C> c;
    public final ld9 d;

    public hya(KSerializer<A> kSerializer, KSerializer<B> kSerializer2, KSerializer<C> kSerializer3) {
        ld9 ld9Var;
        this.a = kSerializer;
        this.b = kSerializer2;
        this.c = kSerializer3;
        SerialDescriptor[] serialDescriptorArr = new SerialDescriptor[0];
        md3 md3Var = new md3(2, this);
        if (z2a.w("kotlin.Triple")) {
            z90.a("Blank serial names are prohibited");
            ld9Var = null;
        } else {
            td1 td1Var = new td1("kotlin.Triple");
            md3Var.invoke(td1Var);
            ld9Var = new ld9("kotlin.Triple", g3a.a.a, td1Var.c.size(), u30.E(serialDescriptorArr), td1Var);
        }
        this.d = ld9Var;
    }

    @Override // defpackage.sy2
    public final Object deserialize(Decoder decoder) {
        ld9 ld9Var = this.d;
        rt1 rt1VarN = decoder.n(ld9Var);
        Object obj = wya.a;
        Object objJ = obj;
        Object objJ2 = objJ;
        Object objJ3 = objJ2;
        while (true) {
            int iG0 = rt1VarN.g0(ld9Var);
            if (iG0 == -1) {
                rt1VarN.i(ld9Var);
                if (objJ == obj) {
                    throw new td9("Element 'first' is missing");
                }
                if (objJ2 == obj) {
                    throw new td9("Element 'second' is missing");
                }
                if (objJ3 != obj) {
                    return new gya(objJ, objJ2, objJ3);
                }
                throw new td9("Element 'third' is missing");
            }
            if (iG0 == 0) {
                objJ = rt1VarN.J(ld9Var, 0, this.a, null);
            } else if (iG0 == 1) {
                objJ2 = rt1VarN.J(ld9Var, 1, this.b, null);
            } else {
                if (iG0 != 2) {
                    throw new td9(pp2.a(iG0, "Unexpected index "));
                }
                objJ3 = rt1VarN.J(ld9Var, 2, this.c, null);
            }
        }
    }

    @Override // defpackage.ud9, defpackage.sy2
    public final SerialDescriptor getDescriptor() {
        return this.d;
    }

    @Override // defpackage.ud9
    public final void serialize(Encoder encoder, Object obj) {
        gya gyaVar = (gya) obj;
        gyaVar.getClass();
        ld9 ld9Var = this.d;
        st1 st1VarN = encoder.n(ld9Var);
        st1VarN.q(ld9Var, 0, this.a, gyaVar.t);
        st1VarN.q(ld9Var, 1, this.b, gyaVar.u);
        st1VarN.q(ld9Var, 2, this.c, gyaVar.v);
        st1VarN.i(ld9Var);
    }
}
