package j$.nio.file;

import java.io.File;
import java.net.URI;
import java.nio.file.WatchEvent;
import java.nio.file.WatchService;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class p implements Path {
    public final /* synthetic */ java.nio.file.Path a;

    public /* synthetic */ p(java.nio.file.Path path) {
        this.a = path;
    }

    public static /* synthetic */ Path z(java.nio.file.Path path) {
        if (path == null) {
            return null;
        }
        return path instanceof q ? ((q) path).a : new p(path);
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path G(Path path) {
        return z(this.a.relativize(q.z(path)));
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ f0 T(g0 g0Var, d0[] d0VarArr) {
        return f0.a(this.a.register(g0Var == null ? null : g0Var.a, j$.desugar.sun.nio.fs.g.v(d0VarArr)));
    }

    @Override // j$.nio.file.Path, java.lang.Comparable
    public final /* synthetic */ int compareTo(Path path) {
        return this.a.compareTo(j$.desugar.sun.nio.fs.g.f(path));
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ boolean endsWith(String str) {
        return this.a.endsWith(str);
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ boolean equals(Object obj) {
        java.nio.file.Path path = this.a;
        if (obj instanceof p) {
            obj = ((p) obj).a;
        }
        return path.equals(obj);
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ void forEach(Consumer<? super Path> consumer) {
        this.a.forEach(consumer);
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path getFileName() {
        return z(this.a.getFileName());
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ h getFileSystem() {
        return f.k(this.a.getFileSystem());
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path getName(int i) {
        return z(this.a.getName(i));
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ int getNameCount() {
        return this.a.getNameCount();
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path getParent() {
        return z(this.a.getParent());
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path getRoot() {
        return z(this.a.getRoot());
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ boolean isAbsolute() {
        return this.a.isAbsolute();
    }

    @Override // j$.nio.file.Path, java.lang.Iterable
    public final Iterator iterator() {
        return new u(this.a.iterator());
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path normalize() {
        return z(this.a.normalize());
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ f0 o(g0 g0Var, d0[] d0VarArr, e0[] e0VarArr) {
        java.nio.file.Path path = this.a;
        WatchEvent.Modifier[] modifierArr = null;
        WatchService watchService = g0Var == null ? null : g0Var.a;
        WatchEvent.Kind<?>[] kindArrV = j$.desugar.sun.nio.fs.g.v(d0VarArr);
        if (e0VarArr != null) {
            int length = e0VarArr.length;
            WatchEvent.Modifier[] modifierArr2 = new WatchEvent.Modifier[length];
            for (int i = 0; i < length; i++) {
                e0 e0Var = e0VarArr[i];
                modifierArr2[i] = e0Var == null ? null : e0Var.a;
            }
            modifierArr = modifierArr2;
        }
        return f0.a(path.register(watchService, kindArrV, modifierArr));
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path q(Path path) {
        return z(this.a.resolve(q.z(path)));
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path r(LinkOption[] linkOptionArr) {
        return z(this.a.toRealPath(j$.desugar.sun.nio.fs.g.u(linkOptionArr)));
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path resolve(String str) {
        return z(this.a.resolve(str));
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path resolveSibling(String str) {
        return z(this.a.resolveSibling(str));
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Spliterator<Path> spliterator() {
        return this.a.spliterator();
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ boolean startsWith(String str) {
        return this.a.startsWith(str);
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path subpath(int i, int i2) {
        return z(this.a.subpath(i, i2));
    }

    @Override // j$.nio.file.Path
    /* JADX INFO: renamed from: t */
    public final /* synthetic */ int compareTo(Path path) {
        return this.a.compareTo(q.z(path));
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path toAbsolutePath() {
        return z(this.a.toAbsolutePath());
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ File toFile() {
        return this.a.toFile();
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ String toString() {
        return this.a.toString();
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ URI toUri() {
        return this.a.toUri();
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ boolean v(Path path) {
        return this.a.startsWith(q.z(path));
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ boolean x(Path path) {
        return this.a.endsWith(q.z(path));
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path y(Path path) {
        return z(this.a.resolveSibling(q.z(path)));
    }
}
