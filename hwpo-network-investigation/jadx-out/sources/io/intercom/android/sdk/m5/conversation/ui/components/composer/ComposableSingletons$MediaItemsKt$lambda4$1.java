package io.intercom.android.sdk.m5.conversation.ui.components.composer;

import android.net.Uri;
import defpackage.a30;
import defpackage.aj1;
import defpackage.bt1;
import defpackage.c30;
import defpackage.ci4;
import defpackage.di;
import defpackage.eo7;
import defpackage.g2b;
import defpackage.it1;
import defpackage.jt1;
import defpackage.kw7;
import defpackage.mh4;
import defpackage.ml5;
import defpackage.oh4;
import defpackage.ox6;
import defpackage.qr5;
import defpackage.rd7;
import defpackage.xr1;
import defpackage.yi1;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.carousel.CarouselScreenFragment;
import io.intercom.android.sdk.m5.conversation.data.MediaUploadRepository;
import io.intercom.android.sdk.m5.conversation.states.MediaUploadItem;
import io.intercom.android.sdk.m5.upload.data.MediaData;

/* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ui.components.composer.ComposableSingletons$MediaItemsKt$lambda-4$1, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$MediaItemsKt$lambda4$1 implements ci4<jt1, Integer, g2b> {
    public static final ComposableSingletons$MediaItemsKt$lambda4$1 INSTANCE = new ComposableSingletons$MediaItemsKt$lambda4$1();

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b invoke$lambda$24$lambda$11$lambda$10(MediaUploadItem mediaUploadItem) {
        mediaUploadItem.getClass();
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b invoke$lambda$24$lambda$15$lambda$14(MediaUploadItem mediaUploadItem) {
        mediaUploadItem.getClass();
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b invoke$lambda$24$lambda$17$lambda$16(MediaUploadItem mediaUploadItem) {
        mediaUploadItem.getClass();
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b invoke$lambda$24$lambda$21$lambda$20(MediaUploadItem mediaUploadItem) {
        mediaUploadItem.getClass();
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b invoke$lambda$24$lambda$23$lambda$22(MediaUploadItem mediaUploadItem) {
        mediaUploadItem.getClass();
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b invoke$lambda$24$lambda$3$lambda$2(MediaUploadItem mediaUploadItem) {
        mediaUploadItem.getClass();
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b invoke$lambda$24$lambda$5$lambda$4(MediaUploadItem mediaUploadItem) {
        mediaUploadItem.getClass();
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b invoke$lambda$24$lambda$9$lambda$8(MediaUploadItem mediaUploadItem) {
        mediaUploadItem.getClass();
        return g2b.a;
    }

    public final void invoke(jt1 jt1Var, int i) {
        if ((i & 3) == 2 && jt1Var.r()) {
            jt1Var.u();
            return;
        }
        c30.h hVar = new c30.h(16.0f, true, new a30());
        ox6 ox6VarI = eo7.i(ox6.a.t, 16.0f);
        aj1 aj1VarA = yi1.a(hVar, di.a.m, jt1Var, 6);
        int iHashCode = Long.hashCode(jt1Var.v());
        kw7 kw7VarY = jt1Var.y();
        ox6 ox6VarC = it1.c(jt1Var, ox6VarI);
        bt1.c.getClass();
        qr5.a aVar = bt1.a.b;
        if (jt1Var.s() == null) {
            ml5.c();
            throw null;
        }
        jt1Var.q();
        if (jt1Var.l()) {
            jt1Var.k(aVar);
        } else {
            jt1Var.z();
        }
        rd7.d(jt1Var, bt1.a.f, aj1VarA);
        rd7.d(jt1Var, bt1.a.e, kw7VarY);
        rd7.d(jt1Var, bt1.a.g, Integer.valueOf(iHashCode));
        rd7.c(jt1Var, bt1.a.h);
        rd7.d(jt1Var, bt1.a.d, ox6VarC);
        Uri uri = Uri.EMPTY;
        uri.getClass();
        MediaUploadItem mediaUploadItem = new MediaUploadItem(null, new MediaData.Media.Other("application/pdf", 0L, "pdf_document.pdf", uri), new MediaUploadItem.UploadState.Success(new Block.Builder()), 1, null);
        jt1Var.K(-1197754305);
        Object objF = jt1Var.f();
        jt1.a.C0187a c0187a = jt1.a.a;
        if (objF == c0187a) {
            objF = new t();
            jt1Var.C(objF);
        }
        mh4 mh4Var = (mh4) objF;
        Object objA = xr1.a(jt1Var, -1197753025);
        if (objA == c0187a) {
            objA = new y();
            jt1Var.C(objA);
        }
        oh4 oh4Var = (oh4) objA;
        Object objA2 = xr1.a(jt1Var, -1197751745);
        if (objA2 == c0187a) {
            objA2 = new z();
            jt1Var.C(objA2);
        }
        jt1Var.B();
        MediaItemsKt.OtherItem(mediaUploadItem, mh4Var, oh4Var, (oh4) objA2, jt1Var, 3504);
        MediaUploadItem mediaUploadItem2 = new MediaUploadItem(null, new MediaData.Media.Other("text/plain", 0L, "txt_document.txt", uri), MediaUploadItem.UploadState.Uploading.INSTANCE, 1, null);
        jt1Var.K(-1197741761);
        Object objF2 = jt1Var.f();
        if (objF2 == c0187a) {
            objF2 = new a0();
            jt1Var.C(objF2);
        }
        mh4 mh4Var2 = (mh4) objF2;
        Object objA3 = xr1.a(jt1Var, -1197740481);
        if (objA3 == c0187a) {
            objA3 = new b0();
            jt1Var.C(objA3);
        }
        oh4 oh4Var2 = (oh4) objA3;
        Object objA4 = xr1.a(jt1Var, -1197739201);
        if (objA4 == c0187a) {
            objA4 = new c0();
            jt1Var.C(objA4);
        }
        jt1Var.B();
        MediaItemsKt.OtherItem(mediaUploadItem2, mh4Var2, oh4Var2, (oh4) objA4, jt1Var, 3504);
        MediaUploadItem mediaUploadItem3 = new MediaUploadItem(null, new MediaData.Media.Other("application/zip", 0L, "zip_document.zip", uri), new MediaUploadItem.UploadState.Error(new MediaUploadRepository.UploadError.ServerError(CarouselScreenFragment.CAROUSEL_ANIMATION_MS)), 1, null);
        jt1Var.K(-1197727265);
        Object objF3 = jt1Var.f();
        if (objF3 == c0187a) {
            objF3 = new d0();
            jt1Var.C(objF3);
        }
        mh4 mh4Var3 = (mh4) objF3;
        Object objA5 = xr1.a(jt1Var, -1197725985);
        if (objA5 == c0187a) {
            objA5 = new e0();
            jt1Var.C(objA5);
        }
        oh4 oh4Var3 = (oh4) objA5;
        Object objA6 = xr1.a(jt1Var, -1197724705);
        if (objA6 == c0187a) {
            objA6 = new u();
            jt1Var.C(objA6);
        }
        jt1Var.B();
        MediaItemsKt.OtherItem(mediaUploadItem3, mh4Var3, oh4Var3, (oh4) objA6, jt1Var, 3504);
        MediaUploadItem mediaUploadItem4 = new MediaUploadItem(null, new MediaData.Media.Other("text/csv", 0L, "csv_document.zip", uri), new MediaUploadItem.UploadState.Error(new MediaUploadRepository.UploadError.SizeLimitExceeded(0L, 0L, "50")), 1, null);
        jt1Var.K(-1197712577);
        Object objF4 = jt1Var.f();
        if (objF4 == c0187a) {
            objF4 = new v();
            jt1Var.C(objF4);
        }
        mh4 mh4Var4 = (mh4) objF4;
        Object objA7 = xr1.a(jt1Var, -1197711297);
        if (objA7 == c0187a) {
            objA7 = new w();
            jt1Var.C(objA7);
        }
        oh4 oh4Var4 = (oh4) objA7;
        Object objA8 = xr1.a(jt1Var, -1197710017);
        if (objA8 == c0187a) {
            objA8 = new x();
            jt1Var.C(objA8);
        }
        jt1Var.B();
        MediaItemsKt.OtherItem(mediaUploadItem4, mh4Var4, oh4Var4, (oh4) objA8, jt1Var, 3504);
        jt1Var.I();
    }

    @Override // defpackage.ci4
    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
        invoke(jt1Var, num.intValue());
        return g2b.a;
    }
}
