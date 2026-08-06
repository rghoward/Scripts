package io.intercom.android.sdk.helpcenter.articles;

import defpackage.gk4;
import defpackage.gy2;
import defpackage.ll;
import defpackage.o2a;
import defpackage.o48;
import defpackage.p48;
import defpackage.rt1;
import defpackage.ry0;
import defpackage.sd9;
import defpackage.st1;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@gy2
public /* synthetic */ class Article$$serializer implements gk4<Article> {
    public static final int $stable;
    public static final Article$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        Article$$serializer article$$serializer = new Article$$serializer();
        INSTANCE = article$$serializer;
        $stable = 8;
        o48 o48Var = new o48("io.intercom.android.sdk.helpcenter.articles.Article", article$$serializer, 2);
        o48Var.k("related_conversation_id", true);
        o48Var.k("card", false);
        descriptor = o48Var;
    }

    private Article$$serializer() {
    }

    @Override // defpackage.gk4
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{ry0.a(o2a.a), ArticleCard$$serializer.INSTANCE};
    }

    @Override // defpackage.sy2
    public final Article deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        rt1 rt1VarN = decoder.n(serialDescriptor);
        boolean z = true;
        int i = 0;
        String str = null;
        ArticleCard articleCard = null;
        while (z) {
            int iG0 = rt1VarN.g0(serialDescriptor);
            if (iG0 == -1) {
                z = false;
            } else if (iG0 == 0) {
                str = (String) rt1VarN.L(serialDescriptor, 0, o2a.a, str);
                i |= 1;
            } else {
                if (iG0 != 1) {
                    ll.a(iG0);
                    return null;
                }
                articleCard = (ArticleCard) rt1VarN.J(serialDescriptor, 1, ArticleCard$$serializer.INSTANCE, articleCard);
                i |= 2;
            }
        }
        rt1VarN.i(serialDescriptor);
        return new Article(i, str, articleCard, (sd9) null);
    }

    @Override // defpackage.ud9, defpackage.sy2
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.ud9
    public final void serialize(Encoder encoder, Article article) {
        encoder.getClass();
        article.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        st1 st1VarN = encoder.n(serialDescriptor);
        Article.write$Self$intercom_sdk_base_release(article, st1VarN, serialDescriptor);
        st1VarN.i(serialDescriptor);
    }

    @Override // defpackage.gk4
    public KSerializer<?>[] typeParametersSerializers() {
        return p48.t;
    }
}
