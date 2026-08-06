package j$.nio.file.spi;

import j$.desugar.sun.nio.fs.g;
import j$.desugar.sun.nio.fs.h;
import j$.nio.file.attribute.d;
import j$.nio.file.attribute.f;
import j$.nio.file.attribute.l;
import j$.nio.file.attribute.m;
import j$.nio.file.attribute.n;
import j$.nio.file.attribute.o;
import j$.nio.file.attribute.q;
import j$.nio.file.attribute.t;
import j$.nio.file.attribute.w;
import j$.nio.file.e;
import j$.nio.file.p;
import j$.nio.file.s;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.channels.FileChannel;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.AccessMode;
import java.nio.file.CopyOption;
import java.nio.file.DirectoryStream;
import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.FileAttributeView;
import java.nio.file.spi.FileSystemProvider;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b extends FileSystemProvider {
    public static final /* synthetic */ int b = 0;
    public final /* synthetic */ c a;

    public /* synthetic */ b(c cVar) {
        this.a = cVar;
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void checkAccess(Path path, AccessMode[] accessModeArr) {
        j$.nio.file.a aVar;
        c cVar = this.a;
        j$.nio.file.Path pathZ = p.z(path);
        j$.nio.file.a[] aVarArr = null;
        if (accessModeArr != null) {
            int length = accessModeArr.length;
            j$.nio.file.a[] aVarArr2 = new j$.nio.file.a[length];
            for (int i = 0; i < length; i++) {
                AccessMode accessMode = accessModeArr[i];
                if (accessMode == null) {
                    aVar = null;
                } else if (accessMode == AccessMode.READ) {
                    aVar = j$.nio.file.a.READ;
                } else {
                    aVar = accessMode == AccessMode.WRITE ? j$.nio.file.a.WRITE : j$.nio.file.a.EXECUTE;
                }
                aVarArr2[i] = aVar;
            }
            aVarArr = aVarArr2;
        }
        cVar.a(pathZ, aVarArr);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void copy(Path path, Path path2, CopyOption[] copyOptionArr) {
        j$.nio.file.CopyOption[] copyOptionArr2;
        c cVar = this.a;
        j$.nio.file.Path pathZ = p.z(path);
        j$.nio.file.Path pathZ2 = p.z(path2);
        if (copyOptionArr == null) {
            copyOptionArr2 = null;
        } else {
            int length = copyOptionArr.length;
            j$.nio.file.CopyOption[] copyOptionArr3 = new j$.nio.file.CopyOption[length];
            for (int i = 0; i < length; i++) {
                copyOptionArr3[i] = j$.nio.file.b.a(copyOptionArr[i]);
            }
            copyOptionArr2 = copyOptionArr3;
        }
        cVar.b(pathZ, pathZ2, copyOptionArr2);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void createDirectory(Path path, FileAttribute[] fileAttributeArr) {
        this.a.c(p.z(path), g.s(fileAttributeArr));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void createLink(Path path, Path path2) {
        this.a.d(p.z(path), p.z(path2));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void createSymbolicLink(Path path, Path path2, FileAttribute[] fileAttributeArr) {
        this.a.e(p.z(path), p.z(path2), g.s(fileAttributeArr));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void delete(Path path) {
        this.a.f(p.z(path));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ boolean deleteIfExists(Path path) {
        return this.a.g(p.z(path));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        c cVar = this.a;
        if (obj instanceof b) {
            obj = ((b) obj).a;
        }
        return cVar.equals(obj);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ FileAttributeView getFileAttributeView(Path path, Class cls, LinkOption[] linkOptionArr) {
        n nVarH = this.a.h(p.z(path), g.g(cls), g.q(linkOptionArr));
        if (nVarH == null) {
            return null;
        }
        if (nVarH instanceof l) {
            return ((l) nVarH).a;
        }
        if (nVarH instanceof d) {
            d dVar = (d) nVarH;
            if (dVar instanceof j$.nio.file.attribute.b) {
                return ((j$.nio.file.attribute.b) dVar).a;
            }
            if (dVar instanceof j$.nio.file.attribute.g) {
                return ((j$.nio.file.attribute.g) dVar).a;
            }
            return dVar instanceof t ? ((t) dVar).a : new j$.nio.file.attribute.c(dVar);
        }
        if (!(nVarH instanceof q)) {
            return nVarH instanceof w ? ((w) nVarH).a : new m(nVarH);
        }
        q qVar = (q) nVarH;
        if (qVar instanceof o) {
            return ((o) qVar).a;
        }
        if (qVar instanceof j$.nio.file.attribute.a) {
            return ((j$.nio.file.attribute.a) qVar).a;
        }
        return qVar instanceof t ? ((t) qVar).a : new j$.nio.file.attribute.p(qVar);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ FileStore getFileStore(Path path) {
        j$.nio.file.d dVarI = this.a.i(p.z(path));
        int i = e.a;
        if (dVarI == null) {
            return null;
        }
        return dVarI.a;
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ FileSystem getFileSystem(URI uri) {
        return j$.nio.file.g.a(this.a.j(uri));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ Path getPath(URI uri) {
        return j$.nio.file.q.z(this.a.k(uri));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ String getScheme() {
        return this.a.l();
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ boolean isHidden(Path path) {
        return this.a.m(p.z(path));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ boolean isSameFile(Path path, Path path2) {
        return this.a.n(p.z(path), p.z(path2));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void move(Path path, Path path2, CopyOption[] copyOptionArr) {
        j$.nio.file.CopyOption[] copyOptionArr2;
        c cVar = this.a;
        j$.nio.file.Path pathZ = p.z(path);
        j$.nio.file.Path pathZ2 = p.z(path2);
        if (copyOptionArr == null) {
            copyOptionArr2 = null;
        } else {
            int length = copyOptionArr.length;
            j$.nio.file.CopyOption[] copyOptionArr3 = new j$.nio.file.CopyOption[length];
            for (int i = 0; i < length; i++) {
                copyOptionArr3[i] = j$.nio.file.b.a(copyOptionArr[i]);
            }
            copyOptionArr2 = copyOptionArr3;
        }
        cVar.o(pathZ, pathZ2, copyOptionArr2);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ AsynchronousFileChannel newAsynchronousFileChannel(Path path, Set set, ExecutorService executorService, FileAttribute[] fileAttributeArr) {
        j$.nio.channels.a aVarP = this.a.p(p.z(path), g.k(set), executorService, g.s(fileAttributeArr));
        int i = j$.nio.channels.b.a;
        if (aVarP == null) {
            return null;
        }
        return aVarP.a;
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ SeekableByteChannel newByteChannel(Path path, Set set, FileAttribute[] fileAttributeArr) {
        return this.a.q(p.z(path), g.k(set), g.s(fileAttributeArr));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final DirectoryStream newDirectoryStream(Path path, DirectoryStream.Filter filter) {
        return new s(this.a.r(p.z(path), new h(filter)));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ FileChannel newFileChannel(Path path, Set set, FileAttribute[] fileAttributeArr) {
        return this.a.s(p.z(path), g.k(set), g.s(fileAttributeArr));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ FileSystem newFileSystem(Path path, Map map) {
        return j$.nio.file.g.a(this.a.t(p.z(path), map));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ InputStream newInputStream(Path path, OpenOption[] openOptionArr) {
        j$.nio.file.n[] nVarArr;
        c cVar = this.a;
        j$.nio.file.Path pathZ = p.z(path);
        if (openOptionArr == null) {
            nVarArr = null;
        } else {
            int length = openOptionArr.length;
            j$.nio.file.n[] nVarArr2 = new j$.nio.file.n[length];
            for (int i = 0; i < length; i++) {
                nVarArr2[i] = j$.nio.file.l.a(openOptionArr[i]);
            }
            nVarArr = nVarArr2;
        }
        return cVar.v(pathZ, nVarArr);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ OutputStream newOutputStream(Path path, OpenOption[] openOptionArr) {
        j$.nio.file.n[] nVarArr;
        c cVar = this.a;
        j$.nio.file.Path pathZ = p.z(path);
        if (openOptionArr == null) {
            nVarArr = null;
        } else {
            int length = openOptionArr.length;
            j$.nio.file.n[] nVarArr2 = new j$.nio.file.n[length];
            for (int i = 0; i < length; i++) {
                nVarArr2[i] = j$.nio.file.l.a(openOptionArr[i]);
            }
            nVarArr = nVarArr2;
        }
        return cVar.w(pathZ, nVarArr);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ BasicFileAttributes readAttributes(Path path, Class cls, LinkOption[] linkOptionArr) {
        return f.a(this.a.x(p.z(path), g.h(cls), g.q(linkOptionArr)));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ Path readSymbolicLink(Path path) {
        return j$.nio.file.q.z(this.a.z(p.z(path)));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void setAttribute(Path path, String str, Object obj, LinkOption[] linkOptionArr) {
        this.a.A(p.z(path), str, g.j(obj), g.q(linkOptionArr));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ FileSystem newFileSystem(URI uri, Map map) {
        return j$.nio.file.g.a(this.a.u(uri, map));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ Map readAttributes(Path path, String str, LinkOption[] linkOptionArr) {
        return g.i(this.a.y(p.z(path), str, g.q(linkOptionArr)));
    }
}
