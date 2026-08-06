package defpackage;

import android.media.MediaCodec;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class dn6 extends mn2 {
    public final int t;

    public dn6(IllegalStateException illegalStateException, en6 en6Var) {
        StringBuilder sb = new StringBuilder("Decoder failed: ");
        sb.append(en6Var == null ? null : en6Var.a);
        super(sb.toString(), illegalStateException);
        boolean z = illegalStateException instanceof MediaCodec.CodecException;
        if (z) {
            ((MediaCodec.CodecException) illegalStateException).getDiagnosticInfo();
        }
        this.t = z ? ((MediaCodec.CodecException) illegalStateException).getErrorCode() : 0;
    }
}
