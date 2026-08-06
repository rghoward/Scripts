package defpackage;

import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class o1a implements xf3 {
    public final Object a;

    public o1a() {
        this.a = new jv2();
    }

    @Override // defpackage.xf3
    public boolean b(Object obj, File file, xk7 xk7Var) throws Throwable {
        InputStream inputStream = (InputStream) obj;
        o30 o30Var = (o30) this.a;
        byte[] bArr = (byte[]) o30Var.c(65536, byte[].class);
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                while (true) {
                    try {
                        int i = inputStream.read(bArr);
                        if (i == -1) {
                            break;
                        }
                        fileOutputStream2.write(bArr, 0, i);
                    } catch (IOException e) {
                        e = e;
                        fileOutputStream = fileOutputStream2;
                        if (Log.isLoggable("StreamEncoder", 3)) {
                            Log.d("StreamEncoder", "Failed to encode data onto the OutputStream", e);
                        }
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused) {
                            }
                        }
                        o30Var.put(bArr);
                        return false;
                    } catch (Throwable th) {
                        th = th;
                        fileOutputStream = fileOutputStream2;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused2) {
                            }
                        }
                        o30Var.put(bArr);
                        throw th;
                    }
                }
                fileOutputStream2.close();
                try {
                    fileOutputStream2.close();
                } catch (IOException unused3) {
                }
                o30Var.put(bArr);
                return true;
            } catch (IOException e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public long c(long j) {
        jv2 jv2Var = (jv2) this.a;
        jv2Var.getClass();
        if (rdb.b(j) <= 0.0f || rdb.c(j) <= 0.0f) {
            uc5.b("maximumVelocity should be a positive value. You specified=" + ((Object) rdb.g(j)));
        }
        return sdb.a(jv2Var.a.b(rdb.b(j)), jv2Var.b.b(rdb.c(j)));
    }

    public o1a(o30 o30Var) {
        this.a = o30Var;
    }
}
