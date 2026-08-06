package io.intercom.android.sdk.lightcompressor;

import android.content.Context;
import android.net.Uri;
import defpackage.aa0;
import defpackage.ci4;
import defpackage.dv8;
import defpackage.g2b;
import defpackage.p6a;
import defpackage.r02;
import defpackage.t72;
import defpackage.xm2;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "io.intercom.android.sdk.lightcompressor.VideoCompressor$doVideoCompression$1$job$1", f = "VideoCompressor.kt", l = {}, m = "invokeSuspend")
public final class VideoCompressor$doVideoCompression$1$job$1 extends p6a implements ci4<t72, r02<? super String>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ int $i;
    final /* synthetic */ List<Uri> $uris;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public VideoCompressor$doVideoCompression$1$job$1(Context context, List<? extends Uri> list, int i, r02<? super VideoCompressor$doVideoCompression$1$job$1> r02Var) {
        super(2, r02Var);
        this.$context = context;
        this.$uris = list;
        this.$i = i;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new VideoCompressor$doVideoCompression$1$job$1(this.$context, this.$uris, this.$i, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super String> r02Var) {
        return ((VideoCompressor$doVideoCompression$1$job$1) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        if (this.label == 0) {
            dv8.b(obj);
            return VideoCompressor.INSTANCE.getMediaPath(this.$context, this.$uris.get(this.$i));
        }
        aa0.c("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
