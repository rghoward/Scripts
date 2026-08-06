package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class arb {
    public static final SerialDescriptor a(SerialDescriptor serialDescriptor, ln4 ln4Var) {
        SerialDescriptor serialDescriptorA;
        KSerializer kSerializerI0;
        serialDescriptor.getClass();
        ln4Var.getClass();
        if (!xj5.a(serialDescriptor.e(), pd9.a.a)) {
            return serialDescriptor.isInline() ? a(serialDescriptor.i(0), ln4Var) : serialDescriptor;
        }
        wn5 wn5VarA = x10.a(serialDescriptor);
        SerialDescriptor descriptor = null;
        if (wn5VarA != null && (kSerializerI0 = ln4Var.I0(wn5VarA, hf3.t)) != null) {
            descriptor = kSerializerI0.getDescriptor();
        }
        return (descriptor == null || (serialDescriptorA = a(descriptor, ln4Var)) == null) ? serialDescriptor : serialDescriptorA;
    }

    public static final zqb b(sl5 sl5Var, SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        pd9 pd9VarE = serialDescriptor.e();
        if (pd9VarE instanceof p58) {
            return zqb.POLY_OBJ;
        }
        boolean zA = xj5.a(pd9VarE, g3a.b.a);
        zqb zqbVar = zqb.LIST;
        if (zA) {
            return zqbVar;
        }
        if (!xj5.a(pd9VarE, g3a.c.a)) {
            return zqb.OBJ;
        }
        SerialDescriptor serialDescriptorA = a(serialDescriptor.i(0), sl5Var.b);
        pd9 pd9VarE2 = serialDescriptorA.e();
        if ((pd9VarE2 instanceof j98) || xj5.a(pd9VarE2, pd9.b.a)) {
            return zqb.MAP;
        }
        if (sl5Var.a.c) {
            return zqbVar;
        }
        throw ha7.c(serialDescriptorA);
    }
}
