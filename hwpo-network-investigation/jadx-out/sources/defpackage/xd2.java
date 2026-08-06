package defpackage;

import android.net.Uri;
import android.os.Process;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class xd2 implements i2d {
    public final Object a;
    public Object b;

    public xd2(fe2 fe2Var, ae2 ae2Var) {
        this.a = fe2Var;
        this.b = ae2Var;
    }

    @Override // defpackage.i2d
    public Object a(h2d h2dVar) throws IOException {
        Uri uri = h2dVar.d;
        AtomicLong atomicLong = j3d.a;
        int iMyPid = Process.myPid();
        long id = Thread.currentThread().getId();
        long jCurrentTimeMillis = System.currentTimeMillis();
        long andIncrement = j3d.a.getAndIncrement();
        int length = String.valueOf(iMyPid).length();
        int length2 = String.valueOf(id).length();
        StringBuilder sb = new StringBuilder(length + 15 + length2 + 1 + String.valueOf(jCurrentTimeMillis).length() + 1 + String.valueOf(andIncrement).length());
        sb.append(".mobstore_tmp-");
        sb.append(iMyPid);
        sb.append("-");
        sb.append(id);
        sb.append("-");
        sb.append(jCurrentTimeMillis);
        sb.append("-");
        sb.append(andIncrement);
        Uri uriBuild = uri.buildUpon().path(String.valueOf(uri.getPath()).concat(sb.toString())).build();
        k3d k3dVar = h2dVar.a;
        ArrayList arrayListA = h2dVar.a(k3dVar.e(uriBuild));
        x2d[] x2dVarArr = (x2d[]) this.b;
        if (x2dVarArr != null) {
            x2dVarArr[0].a(arrayListA);
        }
        try {
            OutputStream outputStream = (OutputStream) arrayListA.get(0);
            try {
                ((g3c) this.a).e(outputStream);
                x2d[] x2dVarArr2 = (x2d[]) this.b;
                if (x2dVarArr2 != null) {
                    x2d x2dVar = x2dVarArr2[0];
                    if (x2dVar.b == null) {
                        throw new c3d("Cannot sync underlying stream");
                    }
                    x2dVar.a.flush();
                    x2dVar.b.t.getFD().sync();
                }
                if (outputStream != null) {
                    outputStream.close();
                }
                k3dVar.g(uriBuild, uri);
                return null;
            } catch (Throwable th) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (Exception e) {
            try {
                k3dVar.f(uriBuild);
            } catch (FileNotFoundException unused) {
            }
            if (e instanceof IOException) {
                throw ((IOException) e);
            }
            throw new IOException(e);
        }
    }

    public xd2(g3c g3cVar) {
        this.a = g3cVar;
    }
}
