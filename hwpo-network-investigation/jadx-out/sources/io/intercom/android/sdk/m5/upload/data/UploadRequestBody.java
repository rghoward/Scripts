package io.intercom.android.sdk.m5.upload.data;

import android.content.Context;
import defpackage.fg1;
import defpackage.fy0;
import defpackage.g2b;
import defpackage.ol8;
import defpackage.qp8;
import defpackage.qq2;
import defpackage.wq6;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class UploadRequestBody extends qp8 {
    private static final int BUFFER_SIZE = 2048;
    private final Context context;
    private final MediaData.Media media;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public UploadRequestBody(Context context, MediaData.Media media) {
        context.getClass();
        media.getClass();
        this.context = context;
        this.media = media;
    }

    @Override // defpackage.qp8
    public long contentLength() {
        return this.media.getSize();
    }

    @Override // defpackage.qp8
    public wq6 contentType() {
        ol8 ol8Var = wq6.e;
        String mimeType = this.media.getMimeType();
        mimeType.getClass();
        try {
            return wq6.a.a(mimeType);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    @Override // defpackage.qp8
    public void writeTo(fy0 fy0Var) throws IOException {
        fy0Var.getClass();
        InputStream inputStreamOpenInputStream = this.context.getContentResolver().openInputStream(this.media.getUri());
        if (inputStreamOpenInputStream == null) {
            return;
        }
        try {
            byte[] bArr = new byte[2048];
            while (true) {
                int i = inputStreamOpenInputStream.read(bArr);
                if (i == -1) {
                    g2b g2bVar = g2b.a;
                    inputStreamOpenInputStream.close();
                    return;
                }
                fy0Var.write(bArr, 0, i);
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                fg1.a(inputStreamOpenInputStream, th);
                throw th2;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        public /* synthetic */ Companion(qq2 qq2Var) {
            this();
        }

        private Companion() {
        }
    }
}
