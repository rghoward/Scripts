package io.intercom.android.sdk.survey.ui.questiontype.files;

import android.net.Uri;
import defpackage.ci4;
import defpackage.g2b;
import defpackage.jt1;
import defpackage.oh4;
import defpackage.ws0;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.upload.data.MediaData;
import io.intercom.android.sdk.survey.ui.models.Answer;
import io.intercom.android.sdk.ui.common.StringProvider;
import java.util.List;

/* JADX INFO: renamed from: io.intercom.android.sdk.survey.ui.questiontype.files.ComposableSingletons$FileAttachmentListKt$lambda-3$1, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$FileAttachmentListKt$lambda3$1 implements ci4<jt1, Integer, g2b> {
    public static final ComposableSingletons$FileAttachmentListKt$lambda3$1 INSTANCE = new ComposableSingletons$FileAttachmentListKt$lambda3$1();

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b invoke$lambda$2$lambda$1(Answer.MediaAnswer.MediaItem mediaItem) {
        mediaItem.getClass();
        return g2b.a;
    }

    public final void invoke(jt1 jt1Var, int i) {
        if ((i & 3) == 2 && jt1Var.r()) {
            jt1Var.u();
            return;
        }
        Uri uri = Uri.EMPTY;
        uri.getClass();
        Answer.MediaAnswer.MediaItem mediaItem = new Answer.MediaAnswer.MediaItem(new MediaData.Media.Image("image/png", 0, 0, 0L, "google.png", uri, null, 64, null));
        mediaItem.setUploadStatus(new Answer.MediaAnswer.FileUploadStatus.Error(new Answer.MediaAnswer.FileUploadError.FileLimitExceeded(ws0.h(new StringProvider.StringRes(R.string.intercom_file_max_limit, null, 2, null)))));
        List listH = ws0.h(mediaItem);
        jt1Var.K(1128558290);
        Object objF = jt1Var.f();
        if (objF == jt1.a.a) {
            objF = new b();
            jt1Var.C(objF);
        }
        jt1Var.B();
        FileAttachmentListKt.FileAttachmentList(listH, (oh4) objF, jt1Var, 48);
    }

    @Override // defpackage.ci4
    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
        invoke(jt1Var, num.intValue());
        return g2b.a;
    }
}
