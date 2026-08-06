package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.os.Build;
import android.util.Log;
import com.intercom.twig.BuildConfig;
import defpackage.aa0;
import defpackage.bg3;
import defpackage.dz2;
import defpackage.qb8;
import defpackage.z97;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.Arrays;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class c {
    public static final a a = new a();

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class b implements InterfaceC0024c {
        @Override // androidx.profileinstaller.c.InterfaceC0024c
        public final void a() {
            Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
        }

        @Override // androidx.profileinstaller.c.InterfaceC0024c
        public final void b(int i, Object obj) {
            String str;
            switch (i) {
                case 1:
                    str = "RESULT_INSTALL_SUCCESS";
                    break;
                case 2:
                    str = "RESULT_ALREADY_INSTALLED";
                    break;
                case 3:
                    str = "RESULT_UNSUPPORTED_ART_VERSION";
                    break;
                case 4:
                    str = "RESULT_NOT_WRITABLE";
                    break;
                case 5:
                    str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                    break;
                case 6:
                    str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                    break;
                case 7:
                    str = "RESULT_IO_EXCEPTION";
                    break;
                case 8:
                    str = "RESULT_PARSE_EXCEPTION";
                    break;
                case 9:
                default:
                    str = BuildConfig.FLAVOR;
                    break;
                case 10:
                    str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                    break;
                case z97.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                    str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                    break;
            }
            if (i == 6 || i == 7 || i == 8) {
                Log.e("ProfileInstaller", str, (Throwable) obj);
            } else {
                Log.d("ProfileInstaller", str);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.profileinstaller.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface InterfaceC0024c {
        void a();

        void b(int i, Object obj);
    }

    public static void a(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } catch (Throwable th) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:107:0x018c A[Catch: all -> 0x0189, TRY_ENTER, TryCatch #25 {all -> 0x0189, blocks: (B:94:0x0168, B:96:0x0174, B:107:0x018c, B:108:0x0191), top: B:280:0x0168, outer: #34 }] */
    /* JADX WARN: Code duplicated, block: B:114:0x019b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:115:0x019d A[Catch: IllegalStateException -> 0x0183, IOException -> 0x0185, FileNotFoundException -> 0x0187, TRY_LEAVE, TryCatch #34 {FileNotFoundException -> 0x0187, IOException -> 0x0185, IllegalStateException -> 0x0183, blocks: (B:92:0x0160, B:97:0x017e, B:115:0x019d, B:113:0x019a, B:112:0x0197, B:94:0x0168, B:96:0x0174, B:107:0x018c, B:108:0x0191, B:109:0x0192), top: B:299:0x0160, inners: #25, #33 }] */
    /* JADX WARN: Code duplicated, block: B:122:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:132:0x01d6 A[Catch: all -> 0x01e4, TRY_LEAVE, TryCatch #3 {all -> 0x01e4, blocks: (B:130:0x01ca, B:132:0x01d6, B:141:0x01e7), top: B:256:0x01ca, outer: #37 }] */
    /* JADX WARN: Code duplicated, block: B:141:0x01e7 A[Catch: all -> 0x01e4, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x01e4, blocks: (B:130:0x01ca, B:132:0x01d6, B:141:0x01e7), top: B:256:0x01ca, outer: #37 }] */
    /* JADX WARN: Code duplicated, block: B:152:0x0204  */
    /* JADX WARN: Code duplicated, block: B:156:0x020c  */
    /* JADX WARN: Code duplicated, block: B:157:0x0210  */
    /* JADX WARN: Code duplicated, block: B:166:0x0230 A[Catch: all -> 0x026e, TryCatch #12 {all -> 0x026e, blocks: (B:164:0x022a, B:166:0x0230, B:167:0x0234, B:169:0x023a), top: B:266:0x022a }] */
    /* JADX WARN: Code duplicated, block: B:169:0x023a A[Catch: all -> 0x026e, TRY_LEAVE, TryCatch #12 {all -> 0x026e, blocks: (B:164:0x022a, B:166:0x0230, B:167:0x0234, B:169:0x023a), top: B:266:0x022a }] */
    /* JADX WARN: Code duplicated, block: B:235:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:239:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:246:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:266:0x022a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:272:0x0105 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:280:0x0168 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:296:0x0214 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:297:0x01c5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:300:0x023f A[EDGE_INSN: B:300:0x023f->B:171:0x023f BREAK  A[LOOP:0: B:167:0x0234->B:301:?], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x00db  */
    /* JADX WARN: Code duplicated, block: B:55:0x010f A[Catch: all -> 0x0122, IllegalStateException -> 0x0125, IOException -> 0x0127, TRY_LEAVE, TryCatch #17 {IllegalStateException -> 0x0125, blocks: (B:53:0x0105, B:55:0x010f, B:66:0x0129, B:67:0x012e), top: B:272:0x0105, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x0129 A[Catch: all -> 0x0122, IllegalStateException -> 0x0125, IOException -> 0x0127, TRY_ENTER, TryCatch #17 {IllegalStateException -> 0x0125, blocks: (B:53:0x0105, B:55:0x010f, B:66:0x0129, B:67:0x012e), top: B:272:0x0105, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x0174 A[Catch: all -> 0x0189, TRY_LEAVE, TryCatch #25 {all -> 0x0189, blocks: (B:94:0x0168, B:96:0x0174, B:107:0x018c, B:108:0x0191), top: B:280:0x0168, outer: #34 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v26, types: [java.io.ByteArrayOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r7v27, types: [int] */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r7v32 */
    /* JADX WARN: Type inference failed for: r7v33, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v37 */
    /* JADX WARN: Type inference failed for: r7v38 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v44 */
    /* JADX WARN: Type inference failed for: r7v45 */
    /* JADX WARN: Type inference failed for: r7v46 */
    /* JADX WARN: Type inference failed for: r7v47 */
    /* JADX WARN: Type inference failed for: r7v48 */
    /* JADX WARN: Type inference failed for: r7v49 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.io.FileInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r7v50 */
    /* JADX WARN: Type inference failed for: r7v51 */
    /* JADX WARN: Type inference failed for: r7v52 */
    /* JADX WARN: Type inference failed for: r7v53 */
    /* JADX WARN: Type inference failed for: r7v54 */
    /* JADX WARN: Type inference failed for: r7v55 */
    /* JADX WARN: Type inference failed for: r7v56 */
    /* JADX WARN: Type inference failed for: r7v57 */
    /* JADX WARN: Type inference failed for: r7v58 */
    /* JADX WARN: Type inference failed for: r7v59 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v60 */
    /* JADX WARN: Type inference failed for: r7v61 */
    /* JADX WARN: Type inference failed for: r7v62 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v17 */
    public static void b(Context context, Executor executor, InterfaceC0024c interfaceC0024c, boolean z) {
        boolean z2;
        ?? A;
        byte[] bArr;
        dz2[] dz2VarArrG;
        dz2[] dz2VarArr;
        InterfaceC0024c interfaceC0024c2;
        dz2[] dz2VarArr2;
        byte[] bArr2;
        ?? r7;
        byte[] bArr3;
        ?? r8;
        boolean z3;
        ByteArrayInputStream byteArrayInputStream;
        Throwable th;
        FileOutputStream fileOutputStream;
        Throwable th2;
        FileChannel channel;
        FileLock fileLockTryLock;
        byte[] bArr4;
        int i;
        ?? r9;
        boolean z4;
        ?? byteArrayOutputStream;
        ?? r10;
        androidx.profileinstaller.b bVar;
        ?? r11;
        FileInputStream fileInputStreamA;
        ?? r12;
        ?? r13;
        boolean z5;
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (!z) {
                File file = new File(filesDir, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
                if (file.exists()) {
                    try {
                        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
                        try {
                            long j = dataInputStream.readLong();
                            dataInputStream.close();
                            z5 = j == packageInfo.lastUpdateTime;
                            if (z5) {
                                interfaceC0024c.b(2, null);
                            }
                        } catch (Throwable th3) {
                            try {
                                dataInputStream.close();
                                throw th3;
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                                throw th3;
                            }
                        }
                    } catch (IOException unused) {
                        z5 = false;
                    }
                } else {
                    z5 = false;
                }
                if (z5) {
                    Log.d("ProfileInstaller", "Skipping profile installation for " + context.getPackageName());
                    d.c(context, false);
                    return;
                }
            }
            Log.d("ProfileInstaller", "Installing profile for " + context.getPackageName());
            File file2 = new File(new File("/data/misc/profiles/cur/0", packageName), "primary.prof");
            androidx.profileinstaller.b bVar2 = new androidx.profileinstaller.b(assets, executor, interfaceC0024c, name, file2);
            byte[] bArr5 = bVar2.c;
            if (bArr5 != null) {
                if (!file2.exists()) {
                    try {
                        if (file2.createNewFile()) {
                            bVar2.f = true;
                            A = bVar2.a(assets, "dexopt/baseline.prof");
                            bArr = qb8.a;
                            if (A != 0) {
                                if (Arrays.equals(bArr, bg3.b(A, 4))) {
                                    throw new IllegalStateException("Invalid magic");
                                }
                                dz2VarArrG = qb8.g(A, bg3.b(A, 4), bVar2.e);
                                A.close();
                                bVar2.g = dz2VarArrG;
                            }
                            dz2VarArr = bVar2.g;
                            if (dz2VarArr != null) {
                                A = "dexopt/baseline.profm";
                                fileInputStreamA = bVar2.a(assets, "dexopt/baseline.profm");
                                r11 = A;
                                if (fileInputStreamA == null) {
                                    if (fileInputStreamA != null) {
                                        fileInputStreamA.close();
                                        r11 = A;
                                    }
                                    bVar = null;
                                    A = r11;
                                } else {
                                    if (Arrays.equals(qb8.b, bg3.b(fileInputStreamA, 4))) {
                                        throw new IllegalStateException("Invalid magic");
                                    }
                                    byte[] bArrB = bg3.b(fileInputStreamA, 4);
                                    bVar2.g = qb8.d(fileInputStreamA, bArrB, bArr5, dz2VarArr);
                                    fileInputStreamA.close();
                                    bVar = bVar2;
                                    A = bArrB;
                                }
                                if (bVar != null) {
                                    bVar2 = bVar;
                                }
                            }
                            interfaceC0024c2 = bVar2.b;
                            dz2VarArr2 = bVar2.g;
                            bArr2 = bVar2.c;
                            r7 = A;
                            r7 = A;
                            if (dz2VarArr2 != null) {
                                byteArrayOutputStream = bVar2.f;
                                if (byteArrayOutputStream != 0) {
                                    aa0.c("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                    return;
                                }
                                byteArrayOutputStream = new ByteArrayOutputStream();
                                byteArrayOutputStream.write(bArr);
                                byteArrayOutputStream.write(bArr2);
                                if (qb8.i(byteArrayOutputStream, bArr2, dz2VarArr2)) {
                                    bVar2.h = byteArrayOutputStream.toByteArray();
                                    byteArrayOutputStream.close();
                                    r10 = byteArrayOutputStream;
                                    bVar2.g = null;
                                    r7 = r10;
                                } else {
                                    interfaceC0024c2.b(5, null);
                                    bVar2.g = null;
                                    byteArrayOutputStream.close();
                                    r7 = byteArrayOutputStream;
                                }
                            }
                            bArr3 = bVar2.h;
                            if (bArr3 != null) {
                                if (bVar2.f) {
                                    aa0.c("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                    return;
                                }
                                byteArrayInputStream = new ByteArrayInputStream(bArr3);
                                fileOutputStream = new FileOutputStream(bVar2.d);
                                channel = fileOutputStream.getChannel();
                                fileLockTryLock = channel.tryLock();
                                if (fileLockTryLock != null) {
                                    if (fileLockTryLock.isValid()) {
                                        bArr4 = new byte[512];
                                        while (true) {
                                            i = byteArrayInputStream.read(bArr4);
                                            if (i > 0) {
                                                break;
                                                break;
                                            }
                                            fileOutputStream.write(bArr4, 0, i);
                                        }
                                        r9 = 1;
                                        bVar2.b(1, null);
                                        fileLockTryLock.close();
                                        channel.close();
                                        fileOutputStream.close();
                                        byteArrayInputStream.close();
                                        bVar2.h = null;
                                        bVar2.g = null;
                                        z3 = true;
                                    }
                                }
                                throw new IOException("Unable to acquire a lock on the underlying file channel.");
                            }
                            z3 = false;
                            r9 = 1;
                            if (z3) {
                                a(packageInfo, filesDir);
                            }
                            z4 = z3;
                            r12 = r9;
                        } else {
                            bVar2.b(4, null);
                        }
                    } catch (IOException unused2) {
                        z2 = true;
                        bVar2.b(4, null);
                    }
                } else if (file2.canWrite()) {
                    bVar2.f = true;
                    try {
                        A = bVar2.a(assets, "dexopt/baseline.prof");
                    } catch (FileNotFoundException e) {
                        interfaceC0024c.b(6, e);
                        A = 0;
                    } catch (IOException e2) {
                        interfaceC0024c.b(7, e2);
                        A = 0;
                    }
                    bArr = qb8.a;
                    try {
                        if (A != 0) {
                            try {
                                try {
                                    if (Arrays.equals(bArr, bg3.b(A, 4))) {
                                        throw new IllegalStateException("Invalid magic");
                                    }
                                    dz2VarArrG = qb8.g(A, bg3.b(A, 4), bVar2.e);
                                    try {
                                        A.close();
                                    } catch (IOException e3) {
                                        interfaceC0024c.b(7, e3);
                                    }
                                    bVar2.g = dz2VarArrG;
                                } catch (IllegalStateException e4) {
                                    interfaceC0024c.b(8, e4);
                                    try {
                                        A.close();
                                    } catch (IOException e5) {
                                        interfaceC0024c.b(7, e5);
                                    }
                                    dz2VarArrG = null;
                                }
                            } catch (IOException e6) {
                                interfaceC0024c.b(7, e6);
                                A.close();
                                dz2VarArrG = null;
                            }
                        }
                        dz2VarArr = bVar2.g;
                        if (dz2VarArr != null && ((A = Build.VERSION.SDK_INT) >= 31 || A == 24 || A == 25)) {
                            try {
                                A = "dexopt/baseline.profm";
                                fileInputStreamA = bVar2.a(assets, "dexopt/baseline.profm");
                                r11 = A;
                                if (fileInputStreamA == null) {
                                    try {
                                        if (Arrays.equals(qb8.b, bg3.b(fileInputStreamA, 4))) {
                                            throw new IllegalStateException("Invalid magic");
                                        }
                                        byte[] bArrB2 = bg3.b(fileInputStreamA, 4);
                                        bVar2.g = qb8.d(fileInputStreamA, bArrB2, bArr5, dz2VarArr);
                                        fileInputStreamA.close();
                                        bVar = bVar2;
                                        A = bArrB2;
                                    } catch (Throwable th5) {
                                        try {
                                            fileInputStreamA.close();
                                            throw th5;
                                        } catch (Throwable th6) {
                                            th5.addSuppressed(th6);
                                            throw th5;
                                        }
                                    }
                                } else {
                                    if (fileInputStreamA != null) {
                                        fileInputStreamA.close();
                                        r11 = A;
                                    }
                                    bVar = null;
                                    A = r11;
                                }
                            } catch (FileNotFoundException e7) {
                                interfaceC0024c.b(9, e7);
                                r11 = A;
                                bVar = null;
                                A = r11;
                            } catch (IOException e8) {
                                interfaceC0024c.b(7, e8);
                                r11 = A;
                                bVar = null;
                                A = r11;
                            } catch (IllegalStateException e9) {
                                bVar2.g = null;
                                interfaceC0024c.b(8, e9);
                                r11 = A;
                                bVar = null;
                                A = r11;
                            }
                            if (bVar != null) {
                                bVar2 = bVar;
                            }
                        }
                        interfaceC0024c2 = bVar2.b;
                        dz2VarArr2 = bVar2.g;
                        bArr2 = bVar2.c;
                        r7 = A;
                        r7 = A;
                        if (dz2VarArr2 != null && bArr2 != null) {
                            byteArrayOutputStream = bVar2.f;
                            if (byteArrayOutputStream != 0) {
                                aa0.c("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                return;
                            }
                            try {
                                byteArrayOutputStream = new ByteArrayOutputStream();
                                try {
                                    byteArrayOutputStream.write(bArr);
                                    byteArrayOutputStream.write(bArr2);
                                    if (qb8.i(byteArrayOutputStream, bArr2, dz2VarArr2)) {
                                        interfaceC0024c2.b(5, null);
                                        bVar2.g = null;
                                        byteArrayOutputStream.close();
                                        r7 = byteArrayOutputStream;
                                    } else {
                                        bVar2.h = byteArrayOutputStream.toByteArray();
                                        byteArrayOutputStream.close();
                                        r10 = byteArrayOutputStream;
                                        bVar2.g = null;
                                        r7 = r10;
                                    }
                                } catch (Throwable th7) {
                                    try {
                                        byteArrayOutputStream.close();
                                        throw th7;
                                    } catch (Throwable th8) {
                                        th7.addSuppressed(th8);
                                        throw th7;
                                    }
                                }
                            } catch (IOException e10) {
                                interfaceC0024c2.b(7, e10);
                                r10 = byteArrayOutputStream;
                            } catch (IllegalStateException e11) {
                                interfaceC0024c2.b(8, e11);
                                r10 = byteArrayOutputStream;
                            }
                        }
                        bArr3 = bVar2.h;
                        if (bArr3 != null) {
                            z3 = false;
                            r9 = 1;
                        } else {
                            try {
                                if (bVar2.f) {
                                    aa0.c("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                    return;
                                }
                                try {
                                    try {
                                        byteArrayInputStream = new ByteArrayInputStream(bArr3);
                                        try {
                                            try {
                                                fileOutputStream = new FileOutputStream(bVar2.d);
                                                try {
                                                    try {
                                                        channel = fileOutputStream.getChannel();
                                                        try {
                                                            fileLockTryLock = channel.tryLock();
                                                            try {
                                                                try {
                                                                    if (fileLockTryLock != null) {
                                                                        try {
                                                                            if (fileLockTryLock.isValid()) {
                                                                                bArr4 = new byte[512];
                                                                                while (true) {
                                                                                    i = byteArrayInputStream.read(bArr4);
                                                                                    if (i > 0) {
                                                                                        break;
                                                                                    } else {
                                                                                        fileOutputStream.write(bArr4, 0, i);
                                                                                    }
                                                                                }
                                                                                r9 = 1;
                                                                                bVar2.b(1, null);
                                                                                fileLockTryLock.close();
                                                                                channel.close();
                                                                                fileOutputStream.close();
                                                                                byteArrayInputStream.close();
                                                                                bVar2.h = null;
                                                                                bVar2.g = null;
                                                                                z3 = true;
                                                                            }
                                                                        } catch (Throwable th9) {
                                                                            th = th9;
                                                                            Throwable th10 = th;
                                                                            if (fileLockTryLock == null) {
                                                                                throw th10;
                                                                            }
                                                                            try {
                                                                                fileLockTryLock.close();
                                                                                throw th10;
                                                                            } catch (Throwable th11) {
                                                                                th10.addSuppressed(th11);
                                                                                throw th10;
                                                                            }
                                                                        }
                                                                    }
                                                                    throw new IOException("Unable to acquire a lock on the underlying file channel.");
                                                                } catch (Throwable th12) {
                                                                    th = th12;
                                                                    Throwable th13 = th;
                                                                    if (channel == null) {
                                                                        throw th13;
                                                                    }
                                                                    try {
                                                                        channel.close();
                                                                        throw th13;
                                                                    } catch (Throwable th14) {
                                                                        th13.addSuppressed(th14);
                                                                        throw th13;
                                                                    }
                                                                }
                                                            } catch (Throwable th15) {
                                                                th = th15;
                                                            }
                                                        } catch (Throwable th16) {
                                                            th = th16;
                                                        }
                                                    } catch (Throwable th17) {
                                                        th = th17;
                                                        th2 = th;
                                                        try {
                                                            fileOutputStream.close();
                                                            throw th2;
                                                        } catch (Throwable th18) {
                                                            th2.addSuppressed(th18);
                                                            throw th2;
                                                        }
                                                    }
                                                } catch (Throwable th19) {
                                                    th = th19;
                                                    th2 = th;
                                                    fileOutputStream.close();
                                                    throw th2;
                                                }
                                            } catch (Throwable th20) {
                                                th = th20;
                                                th = th;
                                                try {
                                                    byteArrayInputStream.close();
                                                    throw th;
                                                } catch (Throwable th21) {
                                                    th.addSuppressed(th21);
                                                    throw th;
                                                }
                                            }
                                        } catch (Throwable th22) {
                                            th = th22;
                                            th = th;
                                            byteArrayInputStream.close();
                                            throw th;
                                        }
                                    } catch (FileNotFoundException e12) {
                                        e = e12;
                                        bVar2.b(6, e);
                                        r8 = r7;
                                        bVar2.h = null;
                                        bVar2.g = null;
                                        z3 = false;
                                        r9 = r8;
                                    } catch (IOException e13) {
                                        e = e13;
                                        bVar2.b(7, e);
                                        r8 = r7;
                                        bVar2.h = null;
                                        bVar2.g = null;
                                        z3 = false;
                                        r9 = r8;
                                    }
                                } catch (FileNotFoundException e14) {
                                    e = e14;
                                    r7 = 1;
                                    bVar2.b(6, e);
                                    r8 = r7;
                                    bVar2.h = null;
                                    bVar2.g = null;
                                    z3 = false;
                                    r9 = r8;
                                } catch (IOException e15) {
                                    e = e15;
                                    r7 = 1;
                                    bVar2.b(7, e);
                                    r8 = r7;
                                    bVar2.h = null;
                                    bVar2.g = null;
                                    z3 = false;
                                    r9 = r8;
                                }
                            } catch (Throwable th23) {
                                bVar2.h = null;
                                bVar2.g = null;
                                throw th23;
                            }
                        }
                        if (z3) {
                            a(packageInfo, filesDir);
                        }
                        z4 = z3;
                        r12 = r9;
                    } catch (Throwable th24) {
                        try {
                            A.close();
                            throw th24;
                        } catch (IOException e16) {
                            interfaceC0024c.b(7, e16);
                            throw th24;
                        }
                    }
                } else {
                    bVar2.b(4, null);
                }
                if (z4 || !z) {
                    r13 = 0;
                } else {
                    r13 = r12;
                }
                d.c(context, r13);
            }
            bVar2.b(3, Integer.valueOf(Build.VERSION.SDK_INT));
            z2 = true;
            z4 = false;
            r12 = z2;
            if (z4) {
                r13 = 0;
            } else {
                r13 = 0;
            }
            d.c(context, r13);
        } catch (PackageManager.NameNotFoundException e17) {
            interfaceC0024c.b(7, e17);
            d.c(context, false);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class a implements InterfaceC0024c {
        @Override // androidx.profileinstaller.c.InterfaceC0024c
        public final void a() {
        }

        @Override // androidx.profileinstaller.c.InterfaceC0024c
        public final void b(int i, Object obj) {
        }
    }
}
