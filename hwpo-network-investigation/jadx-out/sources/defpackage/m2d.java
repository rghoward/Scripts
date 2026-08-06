package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.intercom.twig.BuildConfig;
import io.ably.lib.util.AgentHeaderCreator;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class m2d extends l3d {
    public final Context a;
    public String d;
    public final Object c = new Object();
    public final w2d b = new w2d();

    public m2d(l2d l2dVar) {
        this.a = l2dVar.a;
    }

    @Override // defpackage.k3d
    public final InputStream a(Uri uri) throws b3d, z2d {
        if (i(uri)) {
            throw new z2d("Android backend cannot perform remote operations without a remote backend");
        }
        File fileD = hnb.d(h(uri));
        return new d3d(new FileInputStream(fileD), fileD);
    }

    @Override // defpackage.k3d
    public final boolean b(Uri uri) throws z2d {
        if (i(uri)) {
            throw new z2d("Android backend cannot perform remote operations without a remote backend");
        }
        return hnb.d(h(uri)).exists();
    }

    @Override // defpackage.k3d
    public final String c() {
        return "android";
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:53:0x010f  */
    /* JADX WARN: Code duplicated, block: B:57:0x0116 A[Catch: all -> 0x0129, TryCatch #0 {all -> 0x0129, blocks: (B:55:0x0112, B:57:0x0116, B:60:0x012b, B:61:0x012d), top: B:80:0x0112 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x0139  */
    /* JADX WARN: Code duplicated, block: B:80:0x0112 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.k3d
    public final File d(Uri uri) throws IOException {
        File externalFilesDir;
        Account account;
        File file;
        String str;
        if (i(uri)) {
            o03.a("operation is not permitted in other authorities.");
            return null;
        }
        Context context = this.a;
        if (!uri.getScheme().equals("android")) {
            throw new b3d("Scheme must be 'android'");
        }
        if (uri.getPathSegments().isEmpty()) {
            throw new b3d(String.format("Path must start with a valid logical location: %s", uri));
        }
        if (!TextUtils.isEmpty(uri.getQuery())) {
            throw new b3d("Did not expect uri to have query");
        }
        ArrayList arrayList = new ArrayList(uri.getPathSegments());
        String str2 = (String) arrayList.get(0);
        switch (str2.hashCode()) {
            case -1820761141:
                if (str2.equals("external")) {
                    externalFilesDir = context.getExternalFilesDir(null);
                    file = new File(externalFilesDir, TextUtils.join(File.separator, arrayList.subList(1, arrayList.size())));
                    if (!gqc.b(context)) {
                        synchronized (this.c) {
                            try {
                                if (this.d == null) {
                                    this.d = n2d.a(context.createDeviceProtectedStorageContext()).getParentFile().getAbsolutePath();
                                }
                                str = this.d;
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                        if (!file.getAbsolutePath().startsWith(str)) {
                            throw new z2d("Cannot access credential-protected data from direct boot");
                        }
                    }
                    return file;
                }
                throw new b3d(String.format("Path must start with a valid logical location: %s", uri));
            case 94416770:
                if (str2.equals("cache")) {
                    externalFilesDir = context.getCacheDir();
                    file = new File(externalFilesDir, TextUtils.join(File.separator, arrayList.subList(1, arrayList.size())));
                    if (!gqc.b(context)) {
                        synchronized (this.c) {
                            if (this.d == null) {
                                this.d = n2d.a(context.createDeviceProtectedStorageContext()).getParentFile().getAbsolutePath();
                            }
                            str = this.d;
                            if (!file.getAbsolutePath().startsWith(str)) {
                                throw new z2d("Cannot access credential-protected data from direct boot");
                            }
                        }
                    }
                    return file;
                }
                throw new b3d(String.format("Path must start with a valid logical location: %s", uri));
            case 97434231:
                if (str2.equals("files")) {
                    externalFilesDir = n2d.a(context);
                    file = new File(externalFilesDir, TextUtils.join(File.separator, arrayList.subList(1, arrayList.size())));
                    if (!gqc.b(context)) {
                        synchronized (this.c) {
                            if (this.d == null) {
                                this.d = n2d.a(context.createDeviceProtectedStorageContext()).getParentFile().getAbsolutePath();
                            }
                            str = this.d;
                            if (!file.getAbsolutePath().startsWith(str)) {
                                throw new z2d("Cannot access credential-protected data from direct boot");
                            }
                        }
                    }
                    return file;
                }
                throw new b3d(String.format("Path must start with a valid logical location: %s", uri));
            case 835260319:
                if (str2.equals("managed")) {
                    File file2 = new File(n2d.a(context), "managed");
                    if (arrayList.size() >= 3) {
                        try {
                            String str3 = (String) arrayList.get(2);
                            Account account2 = k2d.a;
                            if ("shared".equals(str3)) {
                                account = k2d.a;
                            } else {
                                int iIndexOf = str3.indexOf(58);
                                h4c.b(iIndexOf >= 0, "Malformed account", new Object[0]);
                                account = new Account(str3.substring(iIndexOf + 1), str3.substring(0, iIndexOf));
                            }
                            if (!k2d.a.equals(account)) {
                                throw new b3d("AccountManager cannot be null");
                            }
                        } catch (IllegalArgumentException e) {
                            throw new b3d(e);
                        }
                    }
                    externalFilesDir = file2;
                    file = new File(externalFilesDir, TextUtils.join(File.separator, arrayList.subList(1, arrayList.size())));
                    if (!gqc.b(context)) {
                        synchronized (this.c) {
                            if (this.d == null) {
                                this.d = n2d.a(context.createDeviceProtectedStorageContext()).getParentFile().getAbsolutePath();
                            }
                            str = this.d;
                            if (!file.getAbsolutePath().startsWith(str)) {
                                throw new z2d("Cannot access credential-protected data from direct boot");
                            }
                        }
                    }
                    return file;
                }
                throw new b3d(String.format("Path must start with a valid logical location: %s", uri));
            case 988548496:
                if (str2.equals("directboot-cache")) {
                    externalFilesDir = context.createDeviceProtectedStorageContext().getCacheDir();
                    file = new File(externalFilesDir, TextUtils.join(File.separator, arrayList.subList(1, arrayList.size())));
                    if (!gqc.b(context)) {
                        synchronized (this.c) {
                            if (this.d == null) {
                                this.d = n2d.a(context.createDeviceProtectedStorageContext()).getParentFile().getAbsolutePath();
                            }
                            str = this.d;
                            if (!file.getAbsolutePath().startsWith(str)) {
                                throw new z2d("Cannot access credential-protected data from direct boot");
                            }
                        }
                    }
                    return file;
                }
                throw new b3d(String.format("Path must start with a valid logical location: %s", uri));
            case 991565957:
                if (str2.equals("directboot-files")) {
                    externalFilesDir = context.createDeviceProtectedStorageContext().getFilesDir();
                    file = new File(externalFilesDir, TextUtils.join(File.separator, arrayList.subList(1, arrayList.size())));
                    if (!gqc.b(context)) {
                        synchronized (this.c) {
                            if (this.d == null) {
                                this.d = n2d.a(context.createDeviceProtectedStorageContext()).getParentFile().getAbsolutePath();
                            }
                            str = this.d;
                            if (!file.getAbsolutePath().startsWith(str)) {
                                throw new z2d("Cannot access credential-protected data from direct boot");
                            }
                        }
                    }
                    return file;
                }
                throw new b3d(String.format("Path must start with a valid logical location: %s", uri));
            default:
                throw new b3d(String.format("Path must start with a valid logical location: %s", uri));
        }
    }

    @Override // defpackage.l3d
    public final Uri h(Uri uri) throws IOException {
        if (i(uri)) {
            throw new b3d("Operation across authorities is not allowed.");
        }
        File fileD = d(uri);
        Uri.Builder builderPath = new Uri.Builder().scheme("file").authority(BuildConfig.FLAVOR).path(AgentHeaderCreator.AGENT_DIVIDER);
        k95.b bVar = k95.u;
        k95.a aVar = new k95.a();
        builderPath.path(fileD.getAbsolutePath());
        ul8 ul8VarG = aVar.g();
        Pattern pattern = h3d.a;
        return builderPath.encodedFragment(ul8VarG.isEmpty() ? null : "transform=".concat(new pl5("+").b(ul8VarG))).build();
    }

    public final boolean i(Uri uri) {
        return (TextUtils.isEmpty(uri.getAuthority()) || this.a.getPackageName().equals(uri.getAuthority())) ? false : true;
    }
}
