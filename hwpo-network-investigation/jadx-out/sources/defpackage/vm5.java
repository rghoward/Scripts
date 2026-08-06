package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonElement;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class vm5 implements KSerializer<um5> {
    public static final vm5 a = new vm5();
    public static final m98 b = od9.a("kotlinx.serialization.json.JsonLiteral", j98.i.a);

    @Override // defpackage.sy2
    public final Object deserialize(Decoder decoder) {
        em5 em5VarF = hu1.f(decoder);
        JsonElement jsonElementM = em5VarF.M();
        if (jsonElementM instanceof um5) {
            return (um5) jsonElementM;
        }
        throw new gm5(ha7.d("Unexpected JSON element, expected JsonLiteral, had " + ll8.a(jsonElementM.getClass()), null, null, em5VarF.l0().a.i ? ha7.h(jsonElementM.toString(), -1).toString() : null, -1));
    }

    @Override // defpackage.ud9, defpackage.sy2
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // defpackage.ud9
    public final void serialize(Encoder encoder, Object obj) {
        Double dValueOf;
        um5 um5Var = (um5) obj;
        um5Var.getClass();
        String str = um5Var.u;
        hu1.e(encoder);
        if (um5Var.t) {
            encoder.D(str);
            return;
        }
        Long lG = v2a.g(str);
        if (lG != null) {
            encoder.y(lG.longValue());
            return;
        }
        w0b w0bVarC = ch.c(str);
        if (w0bVarC != null) {
            encoder.v(a1b.b).y(w0bVarC.t);
            return;
        }
        Boolean bool = null;
        try {
            dValueOf = v2a.d(str) ? Double.valueOf(Double.parseDouble(str)) : null;
        } catch (NumberFormatException unused) {
        }
        if (dValueOf != null) {
            encoder.b(dValueOf.doubleValue());
            return;
        }
        if (str.equals("true")) {
            bool = Boolean.TRUE;
        } else if (str.equals("false")) {
            bool = Boolean.FALSE;
        }
        if (bool != null) {
            encoder.e(bool.booleanValue());
        } else {
            encoder.D(str);
        }
    }
}
