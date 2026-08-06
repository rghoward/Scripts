package io.intercom.android.sdk.m5.conversation.data;

import defpackage.aa0;
import defpackage.ci4;
import defpackage.dv8;
import defpackage.g2b;
import defpackage.ib7;
import defpackage.p6a;
import defpackage.r02;
import defpackage.t72;
import defpackage.v72;
import defpackage.xm2;
import io.intercom.android.sdk.m5.conversation.states.MediaUploadItem;
import io.intercom.android.sdk.m5.upload.data.MediaData;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "io.intercom.android.sdk.m5.conversation.data.MediaUploadStateRepository$startUploadJob$job$1", f = "MediaUploadStateRepository.kt", l = {125}, m = "invokeSuspend")
public final class MediaUploadStateRepository$startUploadJob$job$1 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    final /* synthetic */ int $transparencyBackgroundColor;
    final /* synthetic */ MediaUploadItem $uploadItem;
    int label;
    final /* synthetic */ MediaUploadStateRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaUploadStateRepository$startUploadJob$job$1(MediaUploadStateRepository mediaUploadStateRepository, MediaUploadItem mediaUploadItem, int i, r02<? super MediaUploadStateRepository$startUploadJob$job$1> r02Var) {
        super(2, r02Var);
        this.this$0 = mediaUploadStateRepository;
        this.$uploadItem = mediaUploadItem;
        this.$transparencyBackgroundColor = i;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new MediaUploadStateRepository$startUploadJob$job$1(this.this$0, this.$uploadItem, this.$transparencyBackgroundColor, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((MediaUploadStateRepository$startUploadJob$job$1) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        MediaUploadItem.UploadState error;
        int i = this.label;
        try {
            if (i == 0) {
                dv8.b(obj);
                MediaUploadRepository mediaUploadRepository = this.this$0.mediaUploadRepository;
                MediaData.Media mediaData = this.$uploadItem.getMediaData();
                int i2 = this.$transparencyBackgroundColor;
                this.label = 1;
                obj = mediaUploadRepository.uploadSingleMediaItem(mediaData, i2, this);
                v72 v72Var = v72.t;
                if (obj == v72Var) {
                    return v72Var;
                }
            } else {
                if (i != 1) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dv8.b(obj);
            }
            MediaUploadRepository.UploadResult uploadResult = (MediaUploadRepository.UploadResult) obj;
            if (uploadResult instanceof MediaUploadRepository.UploadResult.Success) {
                error = new MediaUploadItem.UploadState.Success(((MediaUploadRepository.UploadResult.Success) uploadResult).getBlock());
            } else {
                if (!(uploadResult instanceof MediaUploadRepository.UploadResult.Failure)) {
                    throw new ib7();
                }
                error = new MediaUploadItem.UploadState.Error(((MediaUploadRepository.UploadResult.Failure) uploadResult).getError());
            }
            this.this$0.updateItemState(this.$uploadItem.getInstanceId(), error);
            this.this$0.uploadJobs.remove(this.$uploadItem.getInstanceId());
            return g2b.a;
        } catch (Throwable th) {
            this.this$0.uploadJobs.remove(this.$uploadItem.getInstanceId());
            throw th;
        }
    }
}
