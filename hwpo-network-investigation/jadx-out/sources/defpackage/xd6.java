package defpackage;

import android.util.Log;
import java.io.Writer;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class xd6 extends Writer {
    public final StringBuilder u = new StringBuilder(128);
    public final String t = "FragmentManager";

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        h();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        h();
    }

    public final void h() {
        StringBuilder sb = this.u;
        if (sb.length() > 0) {
            Log.d(this.t, sb.toString());
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == '\n') {
                h();
            } else {
                this.u.append(c);
            }
        }
    }
}
