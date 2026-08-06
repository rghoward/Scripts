package io.intercom.android.sdk.helpcenter.sections;

import defpackage.gk4;
import defpackage.gy2;
import defpackage.ll;
import defpackage.o2a;
import defpackage.o48;
import defpackage.p48;
import defpackage.rt1;
import defpackage.sd9;
import defpackage.st1;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@gy2
public /* synthetic */ class HelpCenterSection$$serializer implements gk4<HelpCenterSection> {
    public static final int $stable;
    public static final HelpCenterSection$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        HelpCenterSection$$serializer helpCenterSection$$serializer = new HelpCenterSection$$serializer();
        INSTANCE = helpCenterSection$$serializer;
        $stable = 8;
        o48 o48Var = new o48("io.intercom.android.sdk.helpcenter.sections.HelpCenterSection", helpCenterSection$$serializer, 2);
        o48Var.k("articles", true);
        o48Var.k("name", true);
        descriptor = o48Var;
    }

    private HelpCenterSection$$serializer() {
    }

    @Override // defpackage.gk4
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{HelpCenterSection.$childSerializers[0], o2a.a};
    }

    @Override // defpackage.sy2
    public final HelpCenterSection deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        rt1 rt1VarN = decoder.n(serialDescriptor);
        KSerializer[] kSerializerArr = HelpCenterSection.$childSerializers;
        sd9 sd9Var = null;
        boolean z = true;
        int i = 0;
        List list = null;
        String strC0 = null;
        while (z) {
            int iG0 = rt1VarN.g0(serialDescriptor);
            if (iG0 == -1) {
                z = false;
            } else if (iG0 == 0) {
                list = (List) rt1VarN.J(serialDescriptor, 0, kSerializerArr[0], list);
                i |= 1;
            } else {
                if (iG0 != 1) {
                    ll.a(iG0);
                    return null;
                }
                strC0 = rt1VarN.c0(serialDescriptor, 1);
                i |= 2;
            }
        }
        rt1VarN.i(serialDescriptor);
        return new HelpCenterSection(i, list, strC0, sd9Var);
    }

    @Override // defpackage.ud9, defpackage.sy2
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.ud9
    public final void serialize(Encoder encoder, HelpCenterSection helpCenterSection) {
        encoder.getClass();
        helpCenterSection.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        st1 st1VarN = encoder.n(serialDescriptor);
        HelpCenterSection.write$Self$intercom_sdk_base_release(helpCenterSection, st1VarN, serialDescriptor);
        st1VarN.i(serialDescriptor);
    }

    @Override // defpackage.gk4
    public KSerializer<?>[] typeParametersSerializers() {
        return p48.t;
    }
}
