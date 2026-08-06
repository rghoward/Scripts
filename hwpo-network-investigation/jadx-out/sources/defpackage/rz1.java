package defpackage;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class rz1 implements lu3 {
    public final Uri a;
    public final zk7 b;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements lu3.a<Uri> {
        @Override // lu3.a
        public final lu3 a(Object obj, zk7 zk7Var) {
            Uri uri = (Uri) obj;
            if (xj5.a(uri.getScheme(), "content")) {
                return new rz1(uri, zk7Var);
            }
            return null;
        }
    }

    public rz1(Uri uri, zk7 zk7Var) {
        this.a = uri;
        this.b = zk7Var;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00a7  */
    @Override // defpackage.lu3
    public final Object a(r02<? super ku3> r02Var) throws FileNotFoundException {
        InputStream inputStreamOpenInputStream;
        List<String> pathSegments;
        int size;
        Bundle bundle;
        zk7 zk7Var = this.b;
        ContentResolver contentResolver = zk7Var.a.getContentResolver();
        Uri uri = this.a;
        if (xj5.a(uri.getAuthority(), "com.android.contacts") && xj5.a(uri.getLastPathSegment(), "display_photo")) {
            AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
            inputStreamOpenInputStream = assetFileDescriptorOpenAssetFileDescriptor != null ? assetFileDescriptorOpenAssetFileDescriptor.createInputStream() : null;
            if (inputStreamOpenInputStream == null) {
                qz1.a(uri, "'.", "Unable to find a contact photo associated with '");
                return null;
            }
        } else if (Build.VERSION.SDK_INT >= 29 && xj5.a(uri.getAuthority(), "media") && (size = (pathSegments = uri.getPathSegments()).size()) >= 3 && xj5.a(pathSegments.get(size - 3), "audio") && xj5.a(pathSegments.get(size - 2), "albums")) {
            br9 br9Var = zk7Var.d;
            s03 s03Var = br9Var.a;
            s03.a aVar = s03Var instanceof s03.a ? (s03.a) s03Var : null;
            if (aVar != null) {
                int i = aVar.a;
                s03 s03Var2 = br9Var.b;
                s03.a aVar2 = s03Var2 instanceof s03.a ? (s03.a) s03Var2 : null;
                if (aVar2 != null) {
                    int i2 = aVar2.a;
                    bundle = new Bundle(1);
                    bundle.putParcelable("android.content.extra.SIZE", new Point(i, i2));
                } else {
                    bundle = null;
                }
            } else {
                bundle = null;
            }
            AssetFileDescriptor assetFileDescriptorOpenTypedAssetFile = contentResolver.openTypedAssetFile(uri, "image/*", bundle, null);
            inputStreamOpenInputStream = assetFileDescriptorOpenTypedAssetFile != null ? assetFileDescriptorOpenTypedAssetFile.createInputStream() : null;
            if (inputStreamOpenInputStream == null) {
                qz1.a(uri, "'.", "Unable to find a music thumbnail associated with '");
                return null;
            }
        } else {
            inputStreamOpenInputStream = contentResolver.openInputStream(uri);
            if (inputStreamOpenInputStream == null) {
                qz1.a(uri, "'.", "Unable to open '");
                return null;
            }
        }
        return new tw9(new nw9(new ni8(ev6.c(inputStreamOpenInputStream)), new kd2(zk7Var.a, 1), new jz1(uri)), contentResolver.getType(uri), jf2.v);
    }
}
