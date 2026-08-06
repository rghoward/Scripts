package j$.nio.file;

import java.io.File;
import java.net.URI;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes2.dex */
public interface Path extends Comparable<Path>, Iterable<Path> {
    Path G(Path path);

    default f0 T(g0 g0Var, d0... d0VarArr) {
        return o(g0Var, d0VarArr, new e0[0]);
    }

    default boolean endsWith(String str) {
        return x(getFileSystem().b(str, new String[0]));
    }

    boolean equals(Object obj);

    Path getFileName();

    h getFileSystem();

    Path getName(int i);

    int getNameCount();

    Path getParent();

    Path getRoot();

    boolean isAbsolute();

    default Iterator iterator() {
        return new o(this);
    }

    Path normalize();

    f0 o(g0 g0Var, d0[] d0VarArr, e0... e0VarArr);

    Path q(Path path);

    Path r(LinkOption... linkOptionArr);

    default Path resolve(String str) {
        return q(getFileSystem().b(str, new String[0]));
    }

    default Path resolveSibling(String str) {
        return y(getFileSystem().b(str, new String[0]));
    }

    default boolean startsWith(String str) {
        return v(getFileSystem().b(str, new String[0]));
    }

    Path subpath(int i, int i2);

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    int compareTo(Path path);

    Path toAbsolutePath();

    default File toFile() {
        if (getFileSystem() == j.a) {
            return new File(toString());
        }
        throw new UnsupportedOperationException("Path not associated with default file system.");
    }

    String toString();

    URI toUri();

    boolean v(Path path);

    boolean x(Path path);

    default Path y(Path path) {
        path.getClass();
        Path parent = getParent();
        return parent == null ? path : parent.q(path);
    }
}
