package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import io.ably.lib.util.AgentHeaderCreator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Matcher;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class j2d {
    public final HashMap a;
    public final HashMap b;
    public final ArrayList c;

    public j2d(ArrayList arrayList) {
        List<w3d> list = Collections.EMPTY_LIST;
        this.a = new HashMap();
        this.b = new HashMap();
        this.c = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            k3d k3dVar = (k3d) it.next();
            if (TextUtils.isEmpty(k3dVar.c())) {
                Log.w("MobStore.FileStorage", "Cannot register backend, name empty");
            } else {
                k3d k3dVar2 = (k3d) this.a.put(k3dVar.c(), k3dVar);
                if (k3dVar2 != null) {
                    String canonicalName = k3dVar2.getClass().getCanonicalName();
                    String canonicalName2 = k3dVar.getClass().getCanonicalName();
                    z90.a(ao2.a(new StringBuilder(String.valueOf(canonicalName).length() + 30 + String.valueOf(canonicalName2).length()), "Cannot override Backend ", canonicalName, " with ", canonicalName2));
                    throw null;
                }
            }
        }
        for (w3d w3dVar : list) {
            if (TextUtils.isEmpty(w3dVar.a())) {
                Log.w("MobStore.FileStorage", "Cannot register transform, name empty");
            } else {
                w3d w3dVar2 = (w3d) this.b.put(w3dVar.a(), w3dVar);
                if (w3dVar2 != null) {
                    String canonicalName3 = w3dVar2.getClass().getCanonicalName();
                    String canonicalName4 = w3dVar.getClass().getCanonicalName();
                    z90.a(ao2.a(new StringBuilder(String.valueOf(canonicalName3).length() + 35 + String.valueOf(canonicalName4).length()), "Cannot to override Transform ", canonicalName3, " with ", canonicalName4));
                    throw null;
                }
            }
        }
        this.c.addAll(list);
    }

    public final Object a(Uri uri, i2d i2dVar) {
        return i2dVar.a(b(uri));
    }

    public final h2d b(Uri uri) throws c3d {
        List listP;
        k95.b bVar = k95.u;
        k95.a aVar = new k95.a();
        k95.a aVar2 = new k95.a();
        String encodedFragment = uri.getEncodedFragment();
        if (TextUtils.isEmpty(encodedFragment) || !encodedFragment.startsWith("transform=")) {
            listP = ul8.x;
        } else {
            String strSubstring = encodedFragment.substring(10);
            oy9 oy9VarA = oy9.a("+");
            listP = k95.p(new py9(new oy9(oy9VarA.c, true, oy9VarA.a, oy9VarA.d), strSubstring));
        }
        int size = listP.size();
        for (int i = 0; i < size; i++) {
            String str = (String) listP.get(i);
            Matcher matcher = h3d.a.matcher(str);
            if (!matcher.matches()) {
                z90.a("Invalid fragment spec: ".concat(String.valueOf(str)));
                return null;
            }
            aVar2.c(matcher.group(1));
        }
        ul8 ul8VarG = aVar2.g();
        int i2 = ul8VarG.w;
        for (int i3 = 0; i3 < i2; i3++) {
            String str2 = (String) ul8VarG.get(i3);
            w3d w3dVar = (w3d) this.b.get(str2);
            if (w3dVar == null) {
                String strValueOf = String.valueOf(uri);
                throw new c3d(ao2.a(new StringBuilder(str2.length() + 40 + strValueOf.length()), "Requested transform isn't registered: ", str2, ": ", strValueOf));
            }
            aVar.c(w3dVar);
        }
        k95<E> k95VarZ = aVar.g().z();
        g2d g2dVar = new g2d();
        String scheme = uri.getScheme();
        k3d k3dVar = (k3d) this.a.get(scheme);
        if (k3dVar == null) {
            throw new c3d(ct1.a("Requested backend isn't registered: ", scheme));
        }
        g2dVar.a = k3dVar;
        g2dVar.c = this.c;
        g2dVar.b = k95VarZ;
        g2dVar.d = uri;
        if (!k95VarZ.isEmpty()) {
            ArrayList arrayList = new ArrayList(uri.getPathSegments());
            if (!arrayList.isEmpty() && !uri.getPath().endsWith(AgentHeaderCreator.AGENT_DIVIDER)) {
                String str3 = (String) arrayList.get(arrayList.size() - 1);
                ListIterator listIterator = k95VarZ.listIterator(k95VarZ.size());
                while (listIterator.hasPrevious()) {
                }
                arrayList.set(arrayList.size() - 1, str3);
                uri = uri.buildUpon().path(TextUtils.join(AgentHeaderCreator.AGENT_DIVIDER, arrayList)).encodedFragment(null).build();
            }
        }
        g2dVar.e = uri;
        return new h2d(g2dVar);
    }
}
