package androidx.startup;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class InitializationProvider extends ContentProvider {
    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new IllegalStateException("Not allowed.");
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x003a */
    @Override // android.content.ContentProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onCreate() {
        /*
            r3 = this;
            android.content.Context r0 = r3.getContext()
            if (r0 == 0) goto L41
            android.content.Context r1 = r0.getApplicationContext()
            if (r1 == 0) goto L3f
            r10 r0 = defpackage.r10.c(r0)
            java.lang.Class r3 = r3.getClass()
            android.content.Context r1 = r0.c
            java.lang.String r2 = "Startup"
            defpackage.wra.a(r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L33 java.lang.Throwable -> L3a
            android.content.ComponentName r2 = new android.content.ComponentName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L33 java.lang.Throwable -> L3a
            r2.<init>(r1, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L33 java.lang.Throwable -> L3a
            android.content.pm.PackageManager r3 = r1.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L33 java.lang.Throwable -> L3a
            r1 = 128(0x80, float:1.8E-43)
            android.content.pm.ProviderInfo r3 = r3.getProviderInfo(r2, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L33 java.lang.Throwable -> L3a
            android.os.Bundle r3 = r3.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L33 java.lang.Throwable -> L3a
            r0.a(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L33 java.lang.Throwable -> L3a
            android.os.Trace.endSection()
            goto L3f
        L33:
            r3 = move-exception
            vz9 r0 = new vz9     // Catch: java.lang.Throwable -> L3a
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L3a
            throw r0     // Catch: java.lang.Throwable -> L3a
        L3a:
            r3 = move-exception
            android.os.Trace.endSection()
            throw r3
        L3f:
            r3 = 1
            return r3
        L41:
            vz9 r3 = new vz9
            java.lang.String r0 = "Context cannot be null"
            r3.<init>(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.startup.InitializationProvider.onCreate():boolean");
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new IllegalStateException("Not allowed.");
    }
}
