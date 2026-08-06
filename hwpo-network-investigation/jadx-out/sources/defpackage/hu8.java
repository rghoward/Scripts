package defpackage;

import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.Uri;
import com.intercom.twig.BuildConfig;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class hu8 implements hi6<Uri, Uri> {
    @Override // defpackage.hi6
    public final Uri a(Uri uri, zk7 zk7Var) throws PackageManager.NameNotFoundException {
        String authority;
        Uri uri2 = uri;
        if (xj5.a(uri2.getScheme(), "android.resource") && (authority = uri2.getAuthority()) != null && !z2a.w(authority) && uri2.getPathSegments().size() == 2) {
            String authority2 = uri2.getAuthority();
            if (authority2 == null) {
                authority2 = BuildConfig.FLAVOR;
            }
            Resources resourcesForApplication = zk7Var.a.getPackageManager().getResourcesForApplication(authority2);
            List<String> pathSegments = uri2.getPathSegments();
            int identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority2);
            if (identifier != 0) {
                return Uri.parse("android.resource://" + authority2 + '/' + identifier);
            }
            p.b(uri2, "Invalid android.resource URI: ");
        }
        return null;
    }
}
