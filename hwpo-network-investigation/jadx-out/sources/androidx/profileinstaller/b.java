package androidx.profileinstaller;

import android.content.res.AssetManager;
import android.os.Build;
import defpackage.dz2;
import defpackage.rb8;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    public final Executor a;
    public final c.InterfaceC0024c b;
    public final byte[] c;
    public final File d;
    public final String e;
    public boolean f = false;
    public dz2[] g;
    public byte[] h;

    public b(AssetManager assetManager, Executor executor, c.InterfaceC0024c interfaceC0024c, String str, File file) {
        byte[] bArr;
        this.a = executor;
        this.b = interfaceC0024c;
        this.e = str;
        this.d = file;
        int i = Build.VERSION.SDK_INT;
        if (i < 31) {
            switch (i) {
                case 24:
                case 25:
                    bArr = rb8.e;
                    break;
                case 26:
                    bArr = rb8.d;
                    break;
                case 27:
                    bArr = rb8.c;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = rb8.b;
                    break;
                default:
                    bArr = null;
                    break;
            }
        } else {
            bArr = rb8.a;
        }
        this.c = bArr;
    }

    public final FileInputStream a(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message == null || !message.contains("compressed")) {
                return null;
            }
            this.b.a();
            return null;
        }
    }

    public final void b(final int i, final Serializable serializable) {
        this.a.execute(new Runnable() { // from class: bz2
            @Override // java.lang.Runnable
            public final void run() {
                this.t.b.b(i, serializable);
            }
        });
    }
}
