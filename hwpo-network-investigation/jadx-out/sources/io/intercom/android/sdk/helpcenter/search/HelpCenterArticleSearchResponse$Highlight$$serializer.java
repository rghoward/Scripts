package io.intercom.android.sdk.helpcenter.search;

import defpackage.gk4;
import defpackage.gy2;
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
public /* synthetic */ class HelpCenterArticleSearchResponse$Highlight$$serializer implements gk4<HelpCenterArticleSearchResponse.Highlight> {
    public static final int $stable;
    public static final HelpCenterArticleSearchResponse$Highlight$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        HelpCenterArticleSearchResponse$Highlight$$serializer helpCenterArticleSearchResponse$Highlight$$serializer = new HelpCenterArticleSearchResponse$Highlight$$serializer();
        INSTANCE = helpCenterArticleSearchResponse$Highlight$$serializer;
        $stable = 8;
        o48 o48Var = new o48("io.intercom.android.sdk.helpcenter.search.HelpCenterArticleSearchResponse.Highlight", helpCenterArticleSearchResponse$Highlight$$serializer, 2);
        o48Var.k("title", true);
        o48Var.k("summary", true);
        descriptor = o48Var;
    }

    private HelpCenterArticleSearchResponse$Highlight$$serializer() {
    }

    @Override // defpackage.gk4
    public final KSerializer<?>[] childSerializers() {
        o2a o2aVar = o2a.a;
        return new KSerializer[]{o2aVar, o2aVar};
    }

    @Override // defpackage.sy2
    public final HelpCenterArticleSearchResponse.Highlight deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        rt1 rt1VarN = decoder.n(serialDescriptor);
        boolean z = true;
        int i = 0;
        String strC0 = null;
        String strC1 = null;
        while (z) {
            int iG0 = rt1VarN.g0(serialDescriptor);
            if (iG0 == -1) {
                z = false;
            } else if (iG0 == 0) {
                strC0 = rt1VarN.c0(serialDescriptor, 0);
                i |= 1;
            } else {
                if (iG0 != 1) {
                    ll.a(iG0);
                    return null;
                }
                strC1 = rt1VarN.c0(serialDescriptor, 1);
                i |= 2;
            }
        }
        rt1VarN.i(serialDescriptor);
        return new HelpCenterArticleSearchResponse.Highlight(i, strC0, strC1, (sd9) null);
    }

    @Override // defpackage.ud9, defpackage.sy2
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.ud9
    public final void serialize(Encoder encoder, HelpCenterArticleSearchResponse.Highlight highlight) {
        encoder.getClass();
        highlight.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        st1 st1VarN = encoder.n(serialDescriptor);
        HelpCenterArticleSearchResponse.Highlight.write$Self$intercom_sdk_base_release(highlight, st1VarN, serialDescriptor);
        st1VarN.i(serialDescriptor);
    }

    @Override // defpackage.gk4
    public KSerializer<?>[] typeParametersSerializers() {
        return p48.t;
    }
}
