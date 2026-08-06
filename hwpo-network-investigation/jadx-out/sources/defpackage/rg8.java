package defpackage;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class rg8 implements gx3 {
    public static final Charset c = Charset.forName("UTF-8");
    public final File a;
    public pg8 b;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class a {
        public final byte[] a;
        public final int b;

        public a(byte[] bArr, int i) {
            this.a = bArr;
            this.b = i;
        }
    }

    public rg8(File file) {
        this.a = file;
    }

    @Override // defpackage.gx3
    public final void a() {
        po1.b(this.b, "There was a problem closing the Crashlytics log file.");
        this.b = null;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x000a  */
    @Override // defpackage.gx3
    public final String b() {
        a aVar;
        byte[] bArr;
        if (this.a.exists()) {
            d();
            pg8 pg8Var = this.b;
            if (pg8Var == null) {
                aVar = null;
            } else {
                int[] iArr = {0};
                byte[] bArr2 = new byte[pg8Var.E()];
                try {
                    this.b.m(new qg8(bArr2, iArr));
                } catch (IOException e) {
                    Log.e("FirebaseCrashlytics", "A problem occurred while reading the Crashlytics log file.", e);
                }
                aVar = new a(bArr2, iArr[0]);
            }
        } else {
            aVar = null;
        }
        if (aVar == null) {
            bArr = null;
        } else {
            int i = aVar.b;
            bArr = new byte[i];
            System.arraycopy(aVar.a, 0, bArr, 0, i);
        }
        if (bArr != null) {
            return new String(bArr, c);
        }
        return null;
    }

    @Override // defpackage.gx3
    public final void c(long j, String str) {
        d();
        if (this.b == null) {
            return;
        }
        try {
            if (str.length() > 16384) {
                str = "...".concat(str.substring(str.length() - 16384));
            }
            this.b.h(String.format(Locale.US, "%d %s%n", Long.valueOf(j), str.replaceAll("\r", " ").replaceAll("\n", " ")).getBytes(c));
            while (!this.b.p() && this.b.E() > 65536) {
                this.b.v();
            }
        } catch (IOException e) {
            Log.e("FirebaseCrashlytics", "There was a problem writing to the Crashlytics log.", e);
        }
    }

    public final void d() {
        File file = this.a;
        if (this.b == null) {
            try {
                this.b = new pg8(file);
            } catch (IOException e) {
                Log.e("FirebaseCrashlytics", "Could not open log file: " + file, e);
            }
        }
    }
}
