package defpackage;

import android.os.Build;
import android.os.StrictMode;
import com.intercom.twig.BuildConfig;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class t13 implements Closeable {
    public BufferedWriter B;
    public int D;
    public final File t;
    public final File u;
    public final File v;
    public final File w;
    public final long y;
    public long A = 0;
    public final LinkedHashMap<String, d> C = new LinkedHashMap<>(0, 0.75f, true);
    public long E = 0;
    public final ThreadPoolExecutor F = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new b());
    public final a G = new a();
    public final int x = 1;
    public final int z = 1;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class a implements Callable<Void> {
        public a() {
        }

        @Override // java.util.concurrent.Callable
        public final Void call() {
            synchronized (t13.this) {
                try {
                    t13 t13Var = t13.this;
                    if (t13Var.B == null) {
                        return null;
                    }
                    t13Var.L();
                    if (t13.this.v()) {
                        t13.this.J();
                        t13.this.D = 0;
                    }
                    return null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b implements ThreadFactory {
        @Override // java.util.concurrent.ThreadFactory
        public final synchronized Thread newThread(Runnable runnable) {
            Thread thread;
            thread = new Thread(runnable, "glide-disk-lru-cache-thread");
            thread.setPriority(1);
            return thread;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public final class c {
        public final d a;
        public final boolean[] b;
        public boolean c;

        public c(d dVar) {
            this.a = dVar;
            this.b = dVar.e ? null : new boolean[t13.this.z];
        }

        public final void a() {
            t13.h(t13.this, this, false);
        }

        public final File b() {
            File file;
            synchronized (t13.this) {
                try {
                    d dVar = this.a;
                    if (dVar.f != this) {
                        throw new IllegalStateException();
                    }
                    if (!dVar.e) {
                        this.b[0] = true;
                    }
                    file = dVar.d[0];
                    t13.this.t.mkdirs();
                } catch (Throwable th) {
                    throw th;
                }
            }
            return file;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public final class d {
        public final String a;
        public final long[] b;
        public final File[] c;
        public final File[] d;
        public boolean e;
        public c f;

        public d(String str) {
            this.a = str;
            int i = t13.this.z;
            File file = t13.this.t;
            this.b = new long[i];
            this.c = new File[i];
            this.d = new File[i];
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            for (int i2 = 0; i2 < i; i2++) {
                sb.append(i2);
                this.c[i2] = new File(file, sb.toString());
                sb.append(".tmp");
                this.d[i2] = new File(file, sb.toString());
                sb.setLength(length);
            }
        }

        public final String a() {
            StringBuilder sb = new StringBuilder();
            for (long j : this.b) {
                sb.append(' ');
                sb.append(j);
            }
            return sb.toString();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public final class e {
        public final File[] a;

        public e(File[] fileArr) {
            this.a = fileArr;
        }
    }

    public t13(File file, long j) {
        this.t = file;
        this.u = new File(file, "journal");
        this.v = new File(file, "journal.tmp");
        this.w = new File(file, "journal.bkp");
        this.y = j;
    }

    public static void K(File file, File file2, boolean z) throws IOException {
        if (z) {
            m(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    public static void h(t13 t13Var, c cVar, boolean z) {
        synchronized (t13Var) {
            d dVar = cVar.a;
            if (dVar.f != cVar) {
                throw new IllegalStateException();
            }
            if (z && !dVar.e) {
                for (int i = 0; i < t13Var.z; i++) {
                    if (!cVar.b[i]) {
                        cVar.a();
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                    }
                    if (!dVar.d[i].exists()) {
                        cVar.a();
                        return;
                    }
                }
            }
            for (int i2 = 0; i2 < t13Var.z; i2++) {
                File file = dVar.d[i2];
                if (!z) {
                    m(file);
                } else if (file.exists()) {
                    File file2 = dVar.c[i2];
                    file.renameTo(file2);
                    long j = dVar.b[i2];
                    long length = file2.length();
                    dVar.b[i2] = length;
                    t13Var.A = (t13Var.A - j) + length;
                }
            }
            t13Var.D++;
            dVar.f = null;
            if (dVar.e || z) {
                dVar.e = true;
                t13Var.B.append((CharSequence) "CLEAN");
                t13Var.B.append(' ');
                t13Var.B.append((CharSequence) dVar.a);
                t13Var.B.append((CharSequence) dVar.a());
                t13Var.B.append('\n');
                if (z) {
                    t13Var.E++;
                }
            } else {
                t13Var.C.remove(dVar.a);
                t13Var.B.append((CharSequence) "REMOVE");
                t13Var.B.append(' ');
                t13Var.B.append((CharSequence) dVar.a);
                t13Var.B.append('\n');
            }
            t(t13Var.B);
            if (t13Var.A > t13Var.y || t13Var.v()) {
                t13Var.F.submit(t13Var.G);
            }
        }
    }

    public static void k(BufferedWriter bufferedWriter) throws IOException {
        if (Build.VERSION.SDK_INT < 26) {
            bufferedWriter.close();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            bufferedWriter.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static void m(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    public static void t(BufferedWriter bufferedWriter) throws IOException {
        if (Build.VERSION.SDK_INT < 26) {
            bufferedWriter.flush();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            bufferedWriter.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static t13 y(File file, long j) throws IOException {
        if (j <= 0) {
            z90.a("maxSize <= 0");
            return null;
        }
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else {
                K(file2, file3, false);
            }
        }
        t13 t13Var = new t13(file, j);
        if (t13Var.u.exists()) {
            try {
                t13Var.E();
                t13Var.B();
                return t13Var;
            } catch (IOException e2) {
                System.out.println("DiskLruCache " + file + " is corrupt: " + e2.getMessage() + ", removing");
                t13Var.close();
                k6b.a(t13Var.t);
            }
        }
        file.mkdirs();
        t13 t13Var2 = new t13(file, j);
        t13Var2.J();
        return t13Var2;
    }

    public final void B() throws IOException {
        m(this.v);
        Iterator<d> it = this.C.values().iterator();
        while (it.hasNext()) {
            d next = it.next();
            c cVar = next.f;
            int i = this.z;
            int i2 = 0;
            if (cVar == null) {
                while (i2 < i) {
                    this.A += next.b[i2];
                    i2++;
                }
            } else {
                next.f = null;
                while (i2 < i) {
                    m(next.c[i2]);
                    m(next.d[i2]);
                    i2++;
                }
                it.remove();
            }
        }
    }

    public final void E() {
        File file = this.u;
        c2a c2aVar = new c2a(new FileInputStream(file), k6b.a);
        try {
            String strH = c2aVar.h();
            String strH2 = c2aVar.h();
            String strH3 = c2aVar.h();
            String strH4 = c2aVar.h();
            String strH5 = c2aVar.h();
            if (!"libcore.io.DiskLruCache".equals(strH) || !"1".equals(strH2) || !Integer.toString(this.x).equals(strH3) || !Integer.toString(this.z).equals(strH4) || !BuildConfig.FLAVOR.equals(strH5)) {
                throw new IOException("unexpected journal header: [" + strH + ", " + strH2 + ", " + strH4 + ", " + strH5 + "]");
            }
            int i = 0;
            while (true) {
                try {
                    H(c2aVar.h());
                    i++;
                } catch (EOFException unused) {
                    this.D = i - this.C.size();
                    if (c2aVar.x == -1) {
                        J();
                    } else {
                        this.B = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true), k6b.a));
                    }
                    try {
                        c2aVar.close();
                        return;
                    } catch (RuntimeException e2) {
                        throw e2;
                    } catch (Exception unused2) {
                        return;
                    }
                }
            }
        } catch (Throwable th) {
            try {
                c2aVar.close();
            } catch (RuntimeException e3) {
                throw e3;
            } catch (Exception unused3) {
            }
            throw th;
        }
    }

    public final void H(String str) throws IOException {
        String strSubstring;
        int iIndexOf = str.indexOf(32);
        if (iIndexOf == -1) {
            o03.a("unexpected journal line: ".concat(str));
            return;
        }
        int i = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(32, i);
        LinkedHashMap<String, d> linkedHashMap = this.C;
        if (iIndexOf2 == -1) {
            strSubstring = str.substring(i);
            if (iIndexOf == 6 && str.startsWith("REMOVE")) {
                linkedHashMap.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i, iIndexOf2);
        }
        d dVar = linkedHashMap.get(strSubstring);
        if (dVar == null) {
            dVar = new d(strSubstring);
            linkedHashMap.put(strSubstring, dVar);
        }
        if (iIndexOf2 == -1 || iIndexOf != 5 || !str.startsWith("CLEAN")) {
            if (iIndexOf2 == -1 && iIndexOf == 5 && str.startsWith("DIRTY")) {
                dVar.f = new c(dVar);
                return;
            } else {
                if (iIndexOf2 == -1 && iIndexOf == 4 && str.startsWith("READ")) {
                    return;
                }
                o03.a("unexpected journal line: ".concat(str));
                return;
            }
        }
        String[] strArrSplit = str.substring(iIndexOf2 + 1).split(" ");
        dVar.e = true;
        dVar.f = null;
        if (strArrSplit.length != t13.this.z) {
            y92.a(Arrays.toString(strArrSplit), "unexpected journal line: ");
            return;
        }
        for (int i2 = 0; i2 < strArrSplit.length; i2++) {
            try {
                dVar.b[i2] = Long.parseLong(strArrSplit[i2]);
            } catch (NumberFormatException unused) {
                y92.a(Arrays.toString(strArrSplit), "unexpected journal line: ");
                return;
            }
        }
    }

    public final synchronized void J() {
        try {
            BufferedWriter bufferedWriter = this.B;
            if (bufferedWriter != null) {
                k(bufferedWriter);
            }
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.v), k6b.a));
            try {
                bufferedWriter2.write("libcore.io.DiskLruCache");
                bufferedWriter2.write("\n");
                bufferedWriter2.write("1");
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(this.x));
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(this.z));
                bufferedWriter2.write("\n");
                bufferedWriter2.write("\n");
                for (d dVar : this.C.values()) {
                    if (dVar.f != null) {
                        bufferedWriter2.write("DIRTY " + dVar.a + '\n');
                    } else {
                        bufferedWriter2.write("CLEAN " + dVar.a + dVar.a() + '\n');
                    }
                }
                k(bufferedWriter2);
                if (this.u.exists()) {
                    K(this.u, this.w, true);
                }
                K(this.v, this.u, false);
                this.w.delete();
                this.B = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.u, true), k6b.a));
            } catch (Throwable th) {
                k(bufferedWriter2);
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void L() {
        while (this.A > this.y) {
            String key = this.C.entrySet().iterator().next().getKey();
            synchronized (this) {
                try {
                    if (this.B == null) {
                        throw new IllegalStateException("cache is closed");
                    }
                    d dVar = this.C.get(key);
                    if (dVar != null && dVar.f == null) {
                        for (int i = 0; i < this.z; i++) {
                            File file = dVar.c[i];
                            if (file.exists() && !file.delete()) {
                                throw new IOException("failed to delete " + file);
                            }
                            long j = this.A;
                            long[] jArr = dVar.b;
                            this.A = j - jArr[i];
                            jArr[i] = 0;
                        }
                        this.D++;
                        this.B.append((CharSequence) "REMOVE");
                        this.B.append(' ');
                        this.B.append((CharSequence) key);
                        this.B.append('\n');
                        this.C.remove(key);
                        if (v()) {
                            this.F.submit(this.G);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (this.B == null) {
                return;
            }
            ArrayList arrayList = new ArrayList(this.C.values());
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                c cVar = ((d) obj).f;
                if (cVar != null) {
                    cVar.a();
                }
            }
            L();
            k(this.B);
            this.B = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final c p(String str) {
        synchronized (this) {
            try {
                if (this.B == null) {
                    throw new IllegalStateException("cache is closed");
                }
                d dVar = this.C.get(str);
                if (dVar == null) {
                    dVar = new d(str);
                    this.C.put(str, dVar);
                } else if (dVar.f != null) {
                    return null;
                }
                c cVar = new c(dVar);
                dVar.f = cVar;
                this.B.append((CharSequence) "DIRTY");
                this.B.append(' ');
                this.B.append((CharSequence) str);
                this.B.append('\n');
                t(this.B);
                return cVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized e u(String str) {
        if (this.B == null) {
            throw new IllegalStateException("cache is closed");
        }
        d dVar = this.C.get(str);
        if (dVar == null) {
            return null;
        }
        if (!dVar.e) {
            return null;
        }
        for (File file : dVar.c) {
            if (!file.exists()) {
                return null;
            }
        }
        this.D++;
        this.B.append((CharSequence) "READ");
        this.B.append(' ');
        this.B.append((CharSequence) str);
        this.B.append('\n');
        if (v()) {
            this.F.submit(this.G);
        }
        return new e(dVar.c);
    }

    public final boolean v() {
        int i = this.D;
        return i >= 2000 && i >= this.C.size();
    }
}
