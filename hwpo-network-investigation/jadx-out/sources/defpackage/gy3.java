package defpackage;

import java.io.File;
import java.util.ArrayDeque;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class gy3 implements yc9<File> {
    public final File a;
    public final ry3 b = ry3.t;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static abstract class a extends c {
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public final class b extends k1<File> {
        public final ArrayDeque<c> v;

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public final class a extends a {
            public boolean b;
            public File[] c;
            public int d;
            public boolean e;

            @Override // gy3.c
            public final File a() {
                boolean z = this.e;
                File file = this.a;
                if (!z && this.c == null) {
                    File[] fileArrListFiles = file.listFiles();
                    this.c = fileArrListFiles;
                    if (fileArrListFiles == null) {
                        this.e = true;
                    }
                }
                File[] fileArr = this.c;
                if (fileArr == null || this.d >= fileArr.length) {
                    if (this.b) {
                        return null;
                    }
                    this.b = true;
                    return file;
                }
                fileArr.getClass();
                int i = this.d;
                this.d = i + 1;
                return fileArr[i];
            }
        }

        /* JADX INFO: renamed from: gy3$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public final class C0098b extends c {
            public boolean b;

            @Override // gy3.c
            public final File a() {
                if (this.b) {
                    return null;
                }
                this.b = true;
                return this.a;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public final class c extends a {
            public boolean b;
            public File[] c;
            public int d;

            @Override // gy3.c
            public final File a() {
                boolean z = this.b;
                File file = this.a;
                if (!z) {
                    this.b = true;
                    return file;
                }
                File[] fileArr = this.c;
                if (fileArr != null && this.d >= fileArr.length) {
                    return null;
                }
                if (fileArr == null) {
                    File[] fileArrListFiles = file.listFiles();
                    this.c = fileArrListFiles;
                    if (fileArrListFiles == null || fileArrListFiles.length == 0) {
                        return null;
                    }
                }
                File[] fileArr2 = this.c;
                fileArr2.getClass();
                int i = this.d;
                this.d = i + 1;
                return fileArr2[i];
            }
        }

        public b() {
            ArrayDeque<c> arrayDeque = new ArrayDeque<>();
            this.v = arrayDeque;
            File file = gy3.this.a;
            if (file.isDirectory()) {
                arrayDeque.push(b(file));
            } else if (!file.isFile()) {
                this.t = 2;
            } else {
                file.getClass();
                arrayDeque.push(new C0098b(file));
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.k1
        public final void a() {
            T t;
            while (true) {
                ArrayDeque<c> arrayDeque = this.v;
                c cVarPeek = arrayDeque.peek();
                if (cVarPeek == null) {
                    t = 0;
                    break;
                }
                File fileA = cVarPeek.a();
                if (fileA == null) {
                    arrayDeque.pop();
                } else {
                    if (fileA.equals(cVarPeek.a) || !fileA.isDirectory() || arrayDeque.size() >= Integer.MAX_VALUE) {
                        t = fileA;
                        break;
                    }
                    arrayDeque.push(b(fileA));
                }
            }
            if (t == 0) {
                this.t = 2;
            } else {
                this.u = t;
                this.t = 1;
            }
        }

        public final a b(File file) {
            int iOrdinal = gy3.this.b.ordinal();
            if (iOrdinal == 0) {
                file.getClass();
                return new c(file);
            }
            if (iOrdinal == 1) {
                file.getClass();
                return new a(file);
            }
            u.b();
            return null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static abstract class c {
        public final File a;

        public c(File file) {
            file.getClass();
            this.a = file;
        }

        public abstract File a();
    }

    public gy3(File file) {
        this.a = file;
    }

    @Override // defpackage.yc9
    public final Iterator<File> iterator() {
        return new b();
    }
}
