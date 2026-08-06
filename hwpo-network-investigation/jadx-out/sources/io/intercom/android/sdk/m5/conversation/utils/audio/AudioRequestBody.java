package io.intercom.android.sdk.m5.conversation.utils.audio;

import defpackage.fy0;
import defpackage.lp8;
import defpackage.ol8;
import defpackage.qp8;
import defpackage.wq6;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class AudioRequestBody extends qp8 {
    public static final int $stable = 8;
    private final File audioFile;
    private final qp8 fileRequestBody;

    public AudioRequestBody(File file) {
        wq6 wq6VarA;
        file.getClass();
        this.audioFile = file;
        qp8.a aVar = qp8.Companion;
        ol8 ol8Var = wq6.e;
        try {
            wq6VarA = wq6.a.a(AudioConstants.AUDIO_MEDIA_TYPE);
        } catch (IllegalArgumentException unused) {
            wq6VarA = null;
        }
        aVar.getClass();
        this.fileRequestBody = new lp8(wq6VarA, file);
    }

    @Override // defpackage.qp8
    public long contentLength() {
        return this.fileRequestBody.contentLength();
    }

    @Override // defpackage.qp8
    public wq6 contentType() {
        return this.fileRequestBody.contentType();
    }

    @Override // defpackage.qp8
    public void writeTo(fy0 fy0Var) {
        fy0Var.getClass();
        this.fileRequestBody.writeTo(fy0Var);
    }
}
