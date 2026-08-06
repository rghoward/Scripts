package io.intercom.android.sdk.m5.conversation.ui.components.composer;

import android.net.Uri;
import defpackage.ci4;
import defpackage.g2b;
import defpackage.jt1;
import defpackage.oh4;
import defpackage.ws0;
import defpackage.xr1;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.m5.conversation.states.MediaUploadItem;
import io.intercom.android.sdk.m5.upload.data.MediaData;
import java.util.List;

/* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ui.components.composer.ComposableSingletons$MediaItemsKt$lambda-3$1, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$MediaItemsKt$lambda3$1 implements ci4<jt1, Integer, g2b> {
    public static final ComposableSingletons$MediaItemsKt$lambda3$1 INSTANCE = new ComposableSingletons$MediaItemsKt$lambda3$1();

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b invoke$lambda$1$lambda$0(int i) {
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b invoke$lambda$3$lambda$2(MediaUploadItem mediaUploadItem) {
        mediaUploadItem.getClass();
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b invoke$lambda$5$lambda$4(MediaUploadItem mediaUploadItem) {
        mediaUploadItem.getClass();
        return g2b.a;
    }

    public final void invoke(jt1 jt1Var, int i) {
        if ((i & 3) == 2 && jt1Var.r()) {
            jt1Var.u();
            return;
        }
        Uri uri = Uri.EMPTY;
        uri.getClass();
        List listI = ws0.i(new MediaUploadItem(null, new MediaData.Media.Image("image/png", 0, 0, 0L, "image1", uri, null, 64, null), new MediaUploadItem.UploadState.Success(new Block.Builder()), 1, null), new MediaUploadItem(null, new MediaData.Media.Video("video/mp4", 0, 0, 0L, "video1", uri, 0L, null), new MediaUploadItem.UploadState.Success(new Block.Builder()), 1, null), new MediaUploadItem(null, new MediaData.Media.Other("application/pdf", 0L, "pdf_document.pdf", uri), new MediaUploadItem.UploadState.Success(new Block.Builder()), 1, null));
        jt1Var.K(-780400417);
        Object objF = jt1Var.f();
        jt1.a.C0187a c0187a = jt1.a.a;
        if (objF == c0187a) {
            objF = new q();
            jt1Var.C(objF);
        }
        oh4 oh4Var = (oh4) objF;
        Object objA = xr1.a(jt1Var, -780399265);
        if (objA == c0187a) {
            objA = new r();
            jt1Var.C(objA);
        }
        oh4 oh4Var2 = (oh4) objA;
        Object objA2 = xr1.a(jt1Var, -780398113);
        if (objA2 == c0187a) {
            objA2 = new s();
            jt1Var.C(objA2);
        }
        jt1Var.B();
        MediaItemsKt.MediaItems(listI, oh4Var, oh4Var2, (oh4) objA2, null, jt1Var, 3504, 16);
    }

    @Override // defpackage.ci4
    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
        invoke(jt1Var, num.intValue());
        return g2b.a;
    }
}
