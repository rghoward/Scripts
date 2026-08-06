package io.intercom.android.sdk.helpcenter.collections;

import defpackage.gk4;
import defpackage.gy2;
import defpackage.ig5;
import defpackage.ll;
import defpackage.o2a;
import defpackage.o48;
import defpackage.p48;
import defpackage.rt1;
import defpackage.sd9;
import defpackage.st1;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@gy2
public /* synthetic */ class HelpCenterCollection$$serializer implements gk4<HelpCenterCollection> {
    public static final int $stable;
    public static final HelpCenterCollection$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        HelpCenterCollection$$serializer helpCenterCollection$$serializer = new HelpCenterCollection$$serializer();
        INSTANCE = helpCenterCollection$$serializer;
        $stable = 8;
        o48 o48Var = new o48("io.intercom.android.sdk.helpcenter.collections.HelpCenterCollection", helpCenterCollection$$serializer, 5);
        o48Var.k("description", true);
        o48Var.k("id", false);
        o48Var.k("name", true);
        o48Var.k("article_count", true);
        o48Var.k("collection_count", true);
        descriptor = o48Var;
    }

    private HelpCenterCollection$$serializer() {
    }

    @Override // defpackage.gk4
    public final KSerializer<?>[] childSerializers() {
        o2a o2aVar = o2a.a;
        ig5 ig5Var = ig5.a;
        return new KSerializer[]{o2aVar, o2aVar, o2aVar, ig5Var, ig5Var};
    }

    @Override // defpackage.sy2
    public final HelpCenterCollection deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        rt1 rt1VarN = decoder.n(serialDescriptor);
        boolean z = true;
        int i = 0;
        int iR = 0;
        int iR2 = 0;
        String strC0 = null;
        String strC1 = null;
        String strC2 = null;
        while (z) {
            int iG0 = rt1VarN.g0(serialDescriptor);
            if (iG0 == -1) {
                z = false;
            } else if (iG0 == 0) {
                strC0 = rt1VarN.c0(serialDescriptor, 0);
                i |= 1;
            } else if (iG0 == 1) {
                strC1 = rt1VarN.c0(serialDescriptor, 1);
                i |= 2;
            } else if (iG0 == 2) {
                strC2 = rt1VarN.c0(serialDescriptor, 2);
                i |= 4;
            } else if (iG0 == 3) {
                iR = rt1VarN.R(serialDescriptor, 3);
                i |= 8;
            } else {
                if (iG0 != 4) {
                    ll.a(iG0);
                    return null;
                }
                iR2 = rt1VarN.R(serialDescriptor, 4);
                i |= 16;
            }
        }
        rt1VarN.i(serialDescriptor);
        return new HelpCenterCollection(i, strC0, strC1, strC2, iR, iR2, (sd9) null);
    }

    @Override // defpackage.ud9, defpackage.sy2
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.ud9
    public final void serialize(Encoder encoder, HelpCenterCollection helpCenterCollection) {
        encoder.getClass();
        helpCenterCollection.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        st1 st1VarN = encoder.n(serialDescriptor);
        HelpCenterCollection.write$Self$intercom_sdk_base_release(helpCenterCollection, st1VarN, serialDescriptor);
        st1VarN.i(serialDescriptor);
    }

    @Override // defpackage.gk4
    public KSerializer<?>[] typeParametersSerializers() {
        return p48.t;
    }
}
