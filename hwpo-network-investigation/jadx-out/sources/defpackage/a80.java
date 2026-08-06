package defpackage;

import android.media.AudioDescriptor;
import android.os.Build;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class a80 {
    public static k95<Integer> a(List<AudioDescriptor> list) {
        if (Build.VERSION.SDK_INT < 31 || list == null) {
            k95.b bVar = k95.u;
            return ul8.x;
        }
        TreeSet treeSet = new TreeSet(Comparator.comparing(new z70()).reversed());
        Iterator<AudioDescriptor> it = list.iterator();
        while (it.hasNext()) {
            AudioDescriptor audioDescriptorB = x70.b(it.next());
            if (audioDescriptorB.getStandard() == 1) {
                byte[] descriptor = audioDescriptorB.getDescriptor();
                if (descriptor.length != 3) {
                    md6.g("AudioDescriptorUtil", "Invalid SAD length: " + descriptor.length);
                } else {
                    byte b = descriptor[0];
                    int i = (b & 7) + 1;
                    if (((b >> 3) & 15) == 1) {
                        treeSet.add(Integer.valueOf(n6b.r(i)));
                    }
                }
            }
        }
        return k95.q(treeSet);
    }
}
