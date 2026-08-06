package io.intercom.android.sdk.helpcenter.articles;

import defpackage.gk4;
import defpackage.gy2;
import defpackage.ll;
import defpackage.o48;
import defpackage.p48;
import defpackage.rt1;
import defpackage.st1;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@gy2
public /* synthetic */ class ArticleResponse$$serializer implements gk4<ArticleResponse> {
    public static final int $stable;
    public static final ArticleResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ArticleResponse$$serializer articleResponse$$serializer = new ArticleResponse$$serializer();
        INSTANCE = articleResponse$$serializer;
        $stable = 8;
        o48 o48Var = new o48("io.intercom.android.sdk.helpcenter.articles.ArticleResponse", articleResponse$$serializer, 1);
        o48Var.k("article", false);
        descriptor = o48Var;
    }

    private ArticleResponse$$serializer() {
    }

    @Override // defpackage.gk4
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{Article$$serializer.INSTANCE};
    }

    @Override // defpackage.sy2
    public final ArticleResponse deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        rt1 rt1VarN = decoder.n(serialDescriptor);
        boolean z = true;
        int i = 0;
        Article article = null;
        while (z) {
            int iG0 = rt1VarN.g0(serialDescriptor);
            if (iG0 == -1) {
                z = false;
            } else {
                if (iG0 != 0) {
                    ll.a(iG0);
                    return null;
                }
                article = (Article) rt1VarN.J(serialDescriptor, 0, Article$$serializer.INSTANCE, article);
                i = 1;
            }
        }
        rt1VarN.i(serialDescriptor);
        return new ArticleResponse(i, article, null);
    }

    @Override // defpackage.ud9, defpackage.sy2
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.ud9
    public final void serialize(Encoder encoder, ArticleResponse articleResponse) {
        encoder.getClass();
        articleResponse.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        st1 st1VarN = encoder.n(serialDescriptor);
        st1VarN.q(serialDescriptor, 0, Article$$serializer.INSTANCE, articleResponse.article);
        st1VarN.i(serialDescriptor);
    }

    @Override // defpackage.gk4
    public KSerializer<?>[] typeParametersSerializers() {
        return p48.t;
    }
}
