package defpackage;

import android.util.Log;
import com.intercom.twig.BuildConfig;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NavigableSet;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class fa2 {
    public static final Charset e = Charset.forName("UTF-8");
    public static final int f = 15;
    public static final aa2 g = new aa2();
    public static final ba2 h = new ba2();
    public static final ca2 i = new ca2();
    public final AtomicInteger a = new AtomicInteger(0);
    public final ey3 b;
    public final xk9 c;
    public final v82 d;

    public fa2(ey3 ey3Var, xk9 xk9Var, v82 v82Var) {
        this.b = ey3Var;
        this.c = xk9Var;
        this.d = v82Var;
    }

    public static void a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
    }

    public static String e(File file) throws IOException {
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int i2 = fileInputStream.read(bArr);
                if (i2 <= 0) {
                    String str = new String(byteArrayOutputStream.toByteArray(), e);
                    fileInputStream.close();
                    return str;
                }
                byteArrayOutputStream.write(bArr, 0, i2);
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    public static void f(File file, String str) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), e);
        try {
            outputStreamWriter.write(str);
            outputStreamWriter.close();
        } catch (Throwable th) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList();
        ey3 ey3Var = this.b;
        arrayList.addAll(ey3.e(ey3Var.f.listFiles()));
        arrayList.addAll(ey3.e(ey3Var.g.listFiles()));
        ba2 ba2Var = h;
        Collections.sort(arrayList, ba2Var);
        List listE = ey3.e(ey3Var.e.listFiles());
        Collections.sort(listE, ba2Var);
        arrayList.addAll(listE);
        return arrayList;
    }

    public final NavigableSet c() {
        return new TreeSet(ey3.e(this.b.d.list())).descendingSet();
    }

    public final void d(u92.e.d dVar, String str, boolean z) {
        ey3 ey3Var = this.b;
        int i2 = this.c.b().a.a;
        g.getClass();
        try {
            f(ey3Var.b(str, sk0.c("event", String.format(Locale.US, "%010d", Integer.valueOf(this.a.getAndIncrement())), z ? "_" : BuildConfig.FLAVOR)), aa2.a.a(dVar));
        } catch (IOException e2) {
            Log.w("FirebaseCrashlytics", "Could not persist event for session " + str, e2);
        }
        da2 da2Var = new da2();
        ey3Var.getClass();
        File file = new File(ey3Var.d, str);
        file.mkdirs();
        List<File> listE = ey3.e(file.listFiles(da2Var));
        Collections.sort(listE, new ea2());
        int size = listE.size();
        for (File file2 : listE) {
            if (size <= i2) {
                return;
            }
            ey3.d(file2);
            size--;
        }
    }
}
