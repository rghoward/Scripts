package defpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class tn5 extends fy3 {
    @Override // defpackage.fy3
    public hx3 E(du7 du7Var) {
        du7Var.getClass();
        File file = du7Var.toFile();
        boolean zIsFile = file.isFile();
        boolean zIsDirectory = file.isDirectory();
        long jLastModified = file.lastModified();
        long length = file.length();
        if (zIsFile || zIsDirectory || jLastModified != 0 || length != 0 || file.exists()) {
            return new hx3(zIsFile, zIsDirectory, null, Long.valueOf(length), null, Long.valueOf(jLastModified), null);
        }
        return null;
    }

    @Override // defpackage.fy3
    public final zw3 H(du7 du7Var) {
        du7Var.getClass();
        return new sn5(new RandomAccessFile(du7Var.toFile(), "r"));
    }

    @Override // defpackage.fy3
    public final yq9 J(du7 du7Var) {
        du7Var.getClass();
        return new zm7(new FileOutputStream(du7Var.toFile(), false), new voa());
    }

    @Override // defpackage.fy3
    public final kw9 K(du7 du7Var) {
        du7Var.getClass();
        return new vd5(new FileInputStream(du7Var.toFile()), voa.d);
    }

    @Override // defpackage.fy3
    public final yq9 h(du7 du7Var) {
        du7Var.getClass();
        return new zm7(new FileOutputStream(du7Var.toFile(), true), new voa());
    }

    @Override // defpackage.fy3
    public void k(du7 du7Var, du7 du7Var2) throws IOException {
        du7Var.getClass();
        du7Var2.getClass();
        if (du7Var.toFile().renameTo(du7Var2.toFile())) {
            return;
        }
        throw new IOException("failed to move " + du7Var + " to " + du7Var2);
    }

    @Override // defpackage.fy3
    public final void p(du7 du7Var) throws IOException {
        du7Var.getClass();
        if (du7Var.toFile().mkdir()) {
            return;
        }
        hx3 hx3VarE = E(du7Var);
        if (hx3VarE == null || !hx3VarE.b) {
            i34.c(du7Var, "failed to create directory: ");
        }
    }

    @Override // defpackage.fy3
    public final void t(du7 du7Var) throws IOException {
        du7Var.getClass();
        if (Thread.interrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        File file = du7Var.toFile();
        if (file.delete() || !file.exists()) {
            return;
        }
        i34.c(du7Var, "failed to delete ");
    }

    public String toString() {
        return "JvmSystemFileSystem";
    }

    @Override // defpackage.fy3
    public final List<du7> y(du7 du7Var) throws IOException {
        du7Var.getClass();
        File file = du7Var.toFile();
        String[] list = file.list();
        if (list == null) {
            if (file.exists()) {
                i34.c(du7Var, "failed to list ");
                return null;
            }
            fk.a(du7Var, "no such file: ");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            str.getClass();
            arrayList.add(du7Var.g(str));
        }
        if (arrayList.size() > 1) {
            Collections.sort(arrayList);
        }
        return arrayList;
    }
}
