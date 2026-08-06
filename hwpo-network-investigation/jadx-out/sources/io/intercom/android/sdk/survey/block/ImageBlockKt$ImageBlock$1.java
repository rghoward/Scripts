package io.intercom.android.sdk.survey.block;

import android.content.Context;
import android.graphics.ColorMatrixColorFilter;
import android.net.Uri;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import defpackage.ai1;
import defpackage.al8;
import defpackage.ar6;
import defpackage.b85;
import defpackage.d50;
import defpackage.ei4;
import defpackage.f50;
import defpackage.g2b;
import defpackage.gi0;
import defpackage.h37;
import defpackage.hf8;
import defpackage.ia4;
import defpackage.ir9;
import defpackage.it1;
import defpackage.js7;
import defpackage.jt1;
import defpackage.k85;
import defpackage.kn9;
import defpackage.mh4;
import defpackage.nr1;
import defpackage.nz1;
import defpackage.nz7;
import defpackage.oh4;
import defpackage.ox6;
import defpackage.oz7;
import defpackage.pv0;
import defpackage.pz7;
import defpackage.qu1;
import defpackage.rz7;
import defpackage.tx2;
import defpackage.u7d;
import defpackage.ub5;
import defpackage.we1;
import defpackage.ws0;
import defpackage.y43;
import defpackage.z2a;
import defpackage.zh1;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.m5.preview.data.DownloadState;
import io.intercom.android.sdk.m5.preview.data.IntercomPreviewArgs;
import io.intercom.android.sdk.m5.preview.data.IntercomPreviewFile;
import io.intercom.android.sdk.m5.preview.ui.IntercomPreviewActivity;
import io.intercom.android.sdk.m5.preview.util.MimeTypeResolverKt;
import io.intercom.android.sdk.ui.coil.IntercomImageLoaderKt;
import io.intercom.android.sdk.ui.extension.ModifierExtensionsKt;
import io.intercom.android.sdk.utilities.ImageUtils;
import io.intercom.android.sdk.utilities.LinkOpener;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ImageBlockKt$ImageBlock$1 implements ei4<pv0, jt1, Integer, g2b> {
    final /* synthetic */ long $backgroundColor;
    final /* synthetic */ Block $block;
    final /* synthetic */ String $cacheKey;
    final /* synthetic */ Uri $dataUri;
    final /* synthetic */ oh4<Block, g2b> $onClick;
    final /* synthetic */ ImageRenderType $renderType;
    final /* synthetic */ h37<f50.a> $state$delegate;

    /* JADX WARN: Multi-variable type inference failed */
    public ImageBlockKt$ImageBlock$1(Block block, ImageRenderType imageRenderType, String str, Uri uri, long j, oh4<? super Block, g2b> oh4Var, h37<f50.a> h37Var) {
        this.$block = block;
        this.$renderType = imageRenderType;
        this.$cacheKey = str;
        this.$dataUri = uri;
        this.$backgroundColor = j;
        this.$onClick = oh4Var;
        this.$state$delegate = h37Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ox6 invoke$lambda$10$lambda$9(float f, float f2, ox6 ox6Var) {
        ox6Var.getClass();
        return ir9.k(f, f2, ox6Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b invoke$lambda$13$lambda$12(oh4 oh4Var, Block block, View view, String str, String str2, String str3, String str4) {
        if (oh4Var != null) {
            oh4Var.invoke(block);
        } else {
            String linkUrl = block.getLinkUrl();
            linkUrl.getClass();
            if (linkUrl.length() > 0) {
                LinkOpener.handleUrl(block.getLinkUrl(), view.getContext(), Injector.get().getApi());
            } else {
                Context context = view.getContext();
                IntercomPreviewActivity.Companion companion = IntercomPreviewActivity.Companion;
                context.getClass();
                IntercomPreviewFile.Companion companion2 = IntercomPreviewFile.Companion;
                String url = block.getUrl();
                url.getClass();
                String url2 = block.getUrl();
                url2.getClass();
                List listH = ws0.h(companion2.fromUrl(url, MimeTypeResolverKt.resolveImageMimeType$default(url2, null, 2, null)));
                String url3 = block.getUrl();
                url3.getClass();
                context.startActivity(companion.createIntent(context, new IntercomPreviewArgs(listH, null, null, false, 0, new DownloadState(url3.length() > 0, str, str2, str3, str4), 30, null)).addFlags(268435456));
            }
        }
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b invoke$lambda$15$lambda$14(h37 h37Var, f50.a aVar) {
        aVar.getClass();
        h37Var.setValue(aVar);
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ox6 invoke$lambda$8$lambda$7(float f, float f2, ox6 ox6Var) {
        ox6Var.getClass();
        return ir9.m(ox6Var, 0.0f, 0.0f, f, f2, 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void invoke(pv0 pv0Var, jt1 jt1Var, int i) {
        pv0 pv0Var2;
        int i2;
        js7 js7Var;
        pv0Var.getClass();
        if ((i & 6) == 0) {
            pv0Var2 = pv0Var;
            i2 = i | (jt1Var.J(pv0Var2) ? 4 : 2);
        } else {
            pv0Var2 = pv0Var;
            i2 = i;
        }
        if ((i2 & 19) == 18 && jt1Var.r()) {
            jt1Var.u();
            return;
        }
        tx2 tx2Var = (tx2) jt1Var.F(qu1.h);
        boolean z = this.$block.getHeight() > 0 && this.$block.getWidth() > 0;
        ImageRenderType imageRenderType = this.$renderType;
        ImageRenderType imageRenderType2 = ImageRenderType.WITH_MAX_SIZE;
        if (imageRenderType == imageRenderType2 && z) {
            float fU0 = tx2Var.U0(268.0f);
            int width = this.$block.getWidth();
            int height = this.$block.getHeight();
            Block block = this.$block;
            if (width > height) {
                js7Var = new js7(new y43(tx2Var.I0(fU0)), new y43(tx2Var.I0(fU0 * ((block.getHeight() * 1.0f) / this.$block.getWidth()))));
            } else {
                js7Var = new js7(new y43(tx2Var.I0(((block.getWidth() * 1.0f) / this.$block.getHeight()) * fU0)), new y43(tx2Var.I0(fU0)));
            }
        } else if (imageRenderType == imageRenderType2) {
            js7Var = new js7(new y43(268.0f), new y43(268.0f));
        } else {
            float fD = pv0Var2.d();
            float fI = this.$renderType == ImageRenderType.FULL ? pv0Var2.i() : 1.5f * fD;
            if (this.$block.getHeight() > 0) {
                Block block2 = this.$block;
                float fF0 = tx2Var.F0(ImageUtils.getAspectHeight((int) tx2Var.U0(fD), ImageUtils.getAspectRatio(block2.getWidth(), block2.getHeight())));
                if (fF0 <= fI) {
                    fI = fF0;
                }
            }
            js7Var = new js7(new y43(fD), new y43(fI));
        }
        final float f = ((y43) js7Var.t).t;
        final float f2 = ((y43) js7Var.u).t;
        final View view = (View) jt1Var.F(AndroidCompositionLocals_androidKt.f);
        float[] fArrB = zh1.b();
        zh1.d(fArrB, 0.0f);
        final String strF = nr1.f(jt1Var, R.string.intercom_permission_denied);
        final String strF2 = nr1.f(jt1Var, R.string.intercom_file_saved);
        final String strF3 = nr1.f(jt1Var, R.string.intercom_saving);
        final String strF4 = nr1.f(jt1Var, R.string.intercom_something_went_wrong_try_again);
        hf8 hf8Var = AndroidCompositionLocals_androidKt.b;
        k85.a aVar = new k85.a((Context) jt1Var.F(hf8Var));
        String str = this.$cacheKey;
        boolean z2 = z;
        aVar.f = str != null ? new ar6.a(str) : null;
        aVar.g = str;
        aVar.c = this.$dataUri;
        aVar.e((int) tx2Var.U0(f), (int) tx2Var.U0(f2));
        aVar.b();
        aVar.c(R.drawable.intercom_image_load_failed);
        k85 k85VarA = aVar.a();
        b85 imageLoader = IntercomImageLoaderKt.getImageLoader((Context) jt1Var.F(hf8Var));
        jt1Var.K(1738647987);
        String text = this.$block.getText();
        if (z2a.w(text)) {
            text = nr1.f(jt1Var, R.string.intercom_image_attached);
        }
        jt1Var.B();
        boolean z3 = this.$renderType == imageRenderType2 && !z2;
        jt1Var.K(1738655472);
        boolean zG = jt1Var.g(f) | jt1Var.g(f2);
        Object objF = jt1Var.f();
        Object obj = jt1.a.a;
        if (zG || objF == obj) {
            objF = new oh4() { // from class: io.intercom.android.sdk.survey.block.a
                @Override // defpackage.oh4
                public final Object invoke(Object obj2) {
                    return ImageBlockKt$ImageBlock$1.invoke$lambda$8$lambda$7(f, f2, (ox6) obj2);
                }
            };
            jt1Var.C(objF);
        }
        jt1Var.B();
        ox6 ox6VarIfTrue = ModifierExtensionsKt.ifTrue(ox6.a.t, z3, (oh4) objF);
        boolean z4 = this.$renderType != imageRenderType2 || z2;
        jt1Var.K(1738661544);
        boolean zG2 = jt1Var.g(f) | jt1Var.g(f2);
        Object objF2 = jt1Var.f();
        if (zG2 || objF2 == obj) {
            objF2 = new oh4() { // from class: io.intercom.android.sdk.survey.block.b
                @Override // defpackage.oh4
                public final Object invoke(Object obj2) {
                    return ImageBlockKt$ImageBlock$1.invoke$lambda$10$lambda$9(f, f2, (ox6) obj2);
                }
            };
            jt1Var.C(objF2);
        }
        jt1Var.B();
        ox6 ox6VarIfTrue2 = ModifierExtensionsKt.ifTrue(ox6VarIfTrue, z4, (oh4) objF2);
        long j = this.$backgroundColor;
        al8.a aVar2 = al8.a;
        ox6 ox6VarC = gi0.c(ox6VarIfTrue2, j, aVar2);
        boolean z5 = (ImageBlockKt.ImageBlock_V_9fs2A$lambda$1(this.$state$delegate) instanceof f50.a.C0085a) || (ImageBlockKt.ImageBlock_V_9fs2A$lambda$1(this.$state$delegate) instanceof f50.a.c);
        long jD = u7d.d(2499805183L);
        ub5 ub5Var = (ub5) nz7.a.getValue();
        ub5Var.getClass();
        kn9 kn9Var = new kn9(jD, ub5Var);
        long jC = u7d.c(869059788);
        ox6VarC.getClass();
        ox6 ox6VarA = ia4.a(it1.a(ox6VarC, new rz7(oz7.u, pz7.u, kn9Var, z5, jC, aVar2)), true, null);
        jt1Var.K(1738679467);
        boolean zJ = jt1Var.J(this.$onClick) | jt1Var.j(this.$block) | jt1Var.j(view) | jt1Var.J(strF3) | jt1Var.J(strF2) | jt1Var.J(strF4) | jt1Var.J(strF);
        final oh4<Block, g2b> oh4Var = this.$onClick;
        final Block block3 = this.$block;
        Object objF3 = jt1Var.f();
        if (zJ || objF3 == obj) {
            Object obj2 = new mh4() { // from class: io.intercom.android.sdk.survey.block.c
                @Override // defpackage.mh4
                public final Object invoke() {
                    return ImageBlockKt$ImageBlock$1.invoke$lambda$13$lambda$12(oh4Var, block3, view, strF3, strF2, strF4, strF);
                }
            };
            jt1Var.C(obj2);
            objF3 = obj2;
        }
        jt1Var.B();
        ai1 ai1Var = null;
        ox6 ox6VarC2 = we1.c(ox6VarA, false, null, (mh4) objF3, 15);
        nz1 nz1Var = this.$renderType == ImageRenderType.CROPPED ? nz1.a.a : nz1.a.b;
        if (ImageBlockKt.getHasUri(this.$block)) {
            ai1 ai1Var2 = new ai1(new ColorMatrixColorFilter(fArrB));
            ai1Var2.b = fArrB;
            ai1Var = ai1Var2;
        }
        jt1Var.K(1738650784);
        final h37<f50.a> h37Var = this.$state$delegate;
        Object objF4 = jt1Var.f();
        if (objF4 == obj) {
            objF4 = new oh4() { // from class: io.intercom.android.sdk.survey.block.d
                @Override // defpackage.oh4
                public final Object invoke(Object obj3) {
                    return ImageBlockKt$ImageBlock$1.invoke$lambda$15$lambda$14(h37Var, (f50.a) obj3);
                }
            };
            jt1Var.C(objF4);
        }
        jt1Var.B();
        d50.b(k85VarA, text, imageLoader, ox6VarC2, (oh4) objF4, nz1Var, ai1Var, jt1Var, 196608, 7504);
    }

    @Override // defpackage.ei4
    public /* bridge */ /* synthetic */ g2b invoke(pv0 pv0Var, jt1 jt1Var, Integer num) {
        invoke(pv0Var, jt1Var, num.intValue());
        return g2b.a;
    }
}
