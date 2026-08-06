package io.intercom.android.sdk.helpcenter.sections;

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
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@gy2
public /* synthetic */ class HelpCenterCollectionContent$$serializer implements gk4<HelpCenterCollectionContent> {
    public static final int $stable;
    public static final HelpCenterCollectionContent$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        HelpCenterCollectionContent$$serializer helpCenterCollectionContent$$serializer = new HelpCenterCollectionContent$$serializer();
        INSTANCE = helpCenterCollectionContent$$serializer;
        $stable = 8;
        o48 o48Var = new o48("io.intercom.android.sdk.helpcenter.sections.HelpCenterCollectionContent", helpCenterCollectionContent$$serializer, 8);
        o48Var.k("id", false);
        o48Var.k("name", true);
        o48Var.k("description", true);
        o48Var.k("articles", true);
        o48Var.k("sections", true);
        o48Var.k("collections", true);
        o48Var.k("article_count", false);
        o48Var.k("authors", true);
        descriptor = o48Var;
    }

    private HelpCenterCollectionContent$$serializer() {
    }

    @Override // defpackage.gk4
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = HelpCenterCollectionContent.$childSerializers;
        KSerializer<?> kSerializer = kSerializerArr[3];
        KSerializer<?> kSerializer2 = kSerializerArr[4];
        KSerializer<?> kSerializer3 = kSerializerArr[5];
        KSerializer<?> kSerializer4 = kSerializerArr[7];
        o2a o2aVar = o2a.a;
        return new KSerializer[]{o2aVar, o2aVar, o2aVar, kSerializer, kSerializer2, kSerializer3, ig5.a, kSerializer4};
    }

    @Override // defpackage.sy2
    public final HelpCenterCollectionContent deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        rt1 rt1VarN = decoder.n(serialDescriptor);
        KSerializer[] kSerializerArr = HelpCenterCollectionContent.$childSerializers;
        HelpCenterCollectionContent helpCenterCollectionContent = null;
        boolean z = true;
        List list = null;
        String strC0 = null;
        String strC1 = null;
        String strC2 = null;
        List list2 = null;
        List list3 = null;
        List list4 = null;
        int i = 0;
        int iR = 0;
        while (z) {
            int iG0 = rt1VarN.g0(serialDescriptor);
            switch (iG0) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    strC0 = rt1VarN.c0(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    strC1 = rt1VarN.c0(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    strC2 = rt1VarN.c0(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    list2 = (List) rt1VarN.J(serialDescriptor, 3, kSerializerArr[3], list2);
                    i |= 8;
                    break;
                case 4:
                    list3 = (List) rt1VarN.J(serialDescriptor, 4, kSerializerArr[4], list3);
                    i |= 16;
                    break;
                case 5:
                    list4 = (List) rt1VarN.J(serialDescriptor, 5, kSerializerArr[5], list4);
                    i |= 32;
                    break;
                case 6:
                    iR = rt1VarN.R(serialDescriptor, 6);
                    i |= 64;
                    break;
                case 7:
                    list = (List) rt1VarN.J(serialDescriptor, 7, kSerializerArr[7], list);
                    i |= 128;
                    break;
                default:
                    ll.a(iG0);
                    return helpCenterCollectionContent;
            }
            helpCenterCollectionContent = null;
        }
        rt1VarN.i(serialDescriptor);
        return new HelpCenterCollectionContent(i, strC0, strC1, strC2, list2, list3, list4, iR, list, (sd9) null);
    }

    @Override // defpackage.ud9, defpackage.sy2
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.ud9
    public final void serialize(Encoder encoder, HelpCenterCollectionContent helpCenterCollectionContent) {
        encoder.getClass();
        helpCenterCollectionContent.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        st1 st1VarN = encoder.n(serialDescriptor);
        HelpCenterCollectionContent.write$Self$intercom_sdk_base_release(helpCenterCollectionContent, st1VarN, serialDescriptor);
        st1VarN.i(serialDescriptor);
    }

    @Override // defpackage.gk4
    public KSerializer<?>[] typeParametersSerializers() {
        return p48.t;
    }
}
