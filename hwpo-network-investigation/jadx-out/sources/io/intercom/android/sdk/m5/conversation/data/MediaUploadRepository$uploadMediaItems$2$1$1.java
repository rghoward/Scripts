package io.intercom.android.sdk.m5.conversation.data;

import defpackage.aa0;
import defpackage.ci4;
import defpackage.dv8;
import defpackage.g2b;
import defpackage.p6a;
import defpackage.r02;
import defpackage.t72;
import defpackage.v72;
import defpackage.xm2;
import io.intercom.android.sdk.m5.upload.data.MediaData;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "io.intercom.android.sdk.m5.conversation.data.MediaUploadRepository$uploadMediaItems$2$1$1", f = "MediaUploadRepository.kt", l = {41}, m = "invokeSuspend")
public final class MediaUploadRepository$uploadMediaItems$2$1$1 extends p6a implements ci4<t72, r02<? super MediaUploadRepository.UploadResult>, Object> {
    final /* synthetic */ MediaData.Media $it;
    final /* synthetic */ int $transparencyBackgroundColor;
    int label;
    final /* synthetic */ MediaUploadRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaUploadRepository$uploadMediaItems$2$1$1(MediaUploadRepository mediaUploadRepository, MediaData.Media media, int i, r02<? super MediaUploadRepository$uploadMediaItems$2$1$1> r02Var) {
        super(2, r02Var);
        this.this$0 = mediaUploadRepository;
        this.$it = media;
        this.$transparencyBackgroundColor = i;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new MediaUploadRepository$uploadMediaItems$2$1$1(this.this$0, this.$it, this.$transparencyBackgroundColor, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super MediaUploadRepository.UploadResult> r02Var) {
        return ((MediaUploadRepository$uploadMediaItems$2$1$1) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                dv8.b(obj);
                return obj;
            }
            aa0.c("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        dv8.b(obj);
        MediaUploadRepository mediaUploadRepository = this.this$0;
        MediaData.Media media = this.$it;
        int i2 = this.$transparencyBackgroundColor;
        this.label = 1;
        Object objUploadSingleMediaItem = mediaUploadRepository.uploadSingleMediaItem(media, i2, this);
        v72 v72Var = v72.t;
        return objUploadSingleMediaItem == v72Var ? v72Var : objUploadSingleMediaItem;
    }
}
