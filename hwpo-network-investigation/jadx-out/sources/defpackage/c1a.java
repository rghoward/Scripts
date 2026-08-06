package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class c1a implements if2 {
    public final if2 a;
    public long b;
    public Uri c;
    public Map<String, List<String>> d;

    public c1a(if2 if2Var) {
        if2Var.getClass();
        this.a = if2Var;
        this.c = Uri.EMPTY;
        this.d = Collections.EMPTY_MAP;
    }

    @Override // defpackage.if2
    public final long c(of2 of2Var) {
        if2 if2Var = this.a;
        this.c = of2Var.a;
        this.d = Collections.EMPTY_MAP;
        try {
            return if2Var.c(of2Var);
        } finally {
            Uri uri = if2Var.getUri();
            if (uri != null) {
                this.c = uri;
            }
            this.d = if2Var.k();
        }
    }

    @Override // defpackage.if2
    public final void close() {
        this.a.close();
    }

    @Override // defpackage.if2
    public final void d(yua yuaVar) {
        yuaVar.getClass();
        this.a.d(yuaVar);
    }

    @Override // defpackage.if2
    public final Uri getUri() {
        return this.a.getUri();
    }

    @Override // defpackage.if2
    public final Map<String, List<String>> k() {
        return this.a.k();
    }

    @Override // defpackage.ef2
    public final int read(byte[] bArr, int i, int i2) {
        int i3 = this.a.read(bArr, i, i2);
        if (i3 != -1) {
            this.b += (long) i3;
        }
        return i3;
    }
}
