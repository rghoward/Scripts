package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.database.Cursor;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import androidx.core.content.FileProvider;
import com.intercom.twig.BuildConfig;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class wy3 {
    public static final String a(ContentResolver contentResolver, Uri uri) {
        uri.getClass();
        contentResolver.getClass();
        String scheme = uri.getScheme();
        String string = BuildConfig.FLAVOR;
        if (scheme == null || scheme.hashCode() != 951530617 || !scheme.equals("content")) {
            String lastPathSegment = uri.getLastPathSegment();
            return lastPathSegment == null ? BuildConfig.FLAVOR : lastPathSegment;
        }
        Cursor cursorQuery = contentResolver.query(uri, new String[]{"_display_name"}, null, null, null);
        if (cursorQuery == null) {
            return BuildConfig.FLAVOR;
        }
        try {
            int columnIndexOrThrow = cursorQuery.getColumnIndexOrThrow("_display_name");
            if (cursorQuery.moveToFirst()) {
                string = cursorQuery.getString(columnIndexOrThrow);
                string.getClass();
            }
            cursorQuery.close();
            return string;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                fg1.a(cursorQuery, th);
                throw th2;
            }
        }
    }

    public static final String b(ContentResolver contentResolver, Uri uri) {
        contentResolver.getClass();
        uri.getClass();
        String scheme = uri.getScheme();
        if (scheme != null && scheme.hashCode() == 951530617 && scheme.equals("content")) {
            return contentResolver.getType(uri);
        }
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(uri.toString());
        MimeTypeMap singleton = MimeTypeMap.getSingleton();
        fileExtensionFromUrl.getClass();
        String lowerCase = fileExtensionFromUrl.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        return singleton.getMimeTypeFromExtension(lowerCase);
    }

    public static final Uri c(File file, Context context) {
        context.getClass();
        return FileProvider.getUriForFile(context, "com.hwpo_training_app".concat(".fileprovider"), file);
    }

    public static final long d(ContentResolver contentResolver, Uri uri) throws IOException {
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        long length;
        Cursor cursorQuery;
        uri.getClass();
        contentResolver.getClass();
        try {
            assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
        } catch (FileNotFoundException unused) {
            assetFileDescriptorOpenAssetFileDescriptor = null;
        }
        AssetFileDescriptor assetFileDescriptor = assetFileDescriptorOpenAssetFileDescriptor;
        long j = -1;
        if (assetFileDescriptor != null) {
            try {
                length = assetFileDescriptor.getLength();
                assetFileDescriptor.close();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    fg1.a(assetFileDescriptor, th);
                    throw th2;
                }
            }
        } else {
            length = -1;
        }
        if (length != -1) {
            return length;
        }
        if (w2a.i(uri.getScheme(), "content", false) && (cursorQuery = contentResolver.query(uri, new String[]{"_size"}, null, null, null)) != null) {
            try {
                int columnIndex = cursorQuery.getColumnIndex("_size");
                if (columnIndex != -1) {
                    cursorQuery.moveToFirst();
                    try {
                        j = cursorQuery.getLong(columnIndex);
                    } catch (Throwable unused2) {
                    }
                    cursorQuery.close();
                    return j;
                }
                cursorQuery.close();
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    fg1.a(cursorQuery, th3);
                    throw th4;
                }
            }
        }
        return -1L;
    }

    public static final n17 e(Uri uri, ContentResolver contentResolver, String str) {
        uri.getClass();
        contentResolver.getClass();
        str.getClass();
        String string = UUID.randomUUID().toString();
        string.getClass();
        g01 g01Var = g01.w;
        g01 g01VarC = g01.a.c(string);
        wq6 wq6Var = n17.e;
        ArrayList arrayList = new ArrayList();
        arrayList.add(n17.c.a.b("media[file]", str, new sz1(contentResolver, uri)));
        if (!arrayList.isEmpty()) {
            return new n17(g01VarC, wq6Var, ytb.k(arrayList));
        }
        aa0.c("Multipart body must have at least one part.");
        return null;
    }
}
