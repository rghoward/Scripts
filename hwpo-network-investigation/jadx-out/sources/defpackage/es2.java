package defpackage;

import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class es2 implements qb6 {
    @Override // defpackage.qb6
    public final long a(qb6.c cVar) {
        for (Throwable cause = cVar.a; cause != null; cause = cause.getCause()) {
            if ((cause instanceof ut7) || (cause instanceof FileNotFoundException) || (cause instanceof k45) || (cause instanceof yb6.g)) {
                return -9223372036854775807L;
            }
            if ((cause instanceof lf2) && ((lf2) cause).t == 2008) {
                return -9223372036854775807L;
            }
        }
        return Math.min((cVar.b - 1) * 1000, 5000);
    }

    @Override // defpackage.qb6
    public final qb6.b b(qb6.a aVar, qb6.c cVar) {
        IOException iOException = cVar.a;
        if (!(iOException instanceof n45)) {
            return null;
        }
        int i = ((n45) iOException).v;
        if (i != 403 && i != 404 && i != 410 && i != 416 && i != 500 && i != 503) {
            return null;
        }
        if (aVar.a - aVar.b > 1) {
            return new qb6.b(1, AudioConstants.MAX_RECORDING_DURATION_MS);
        }
        if (aVar.c - aVar.d > 1) {
            return new qb6.b(2, 60000L);
        }
        return null;
    }

    @Override // defpackage.qb6
    public final int c(int i) {
        return i == 7 ? 6 : 3;
    }
}
