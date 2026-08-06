package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioProfile;
import android.media.AudioTrack;
import android.os.Build;
import android.provider.Settings;
import android.util.Pair;
import android.util.SparseArray;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class u70 {
    public static final ul8 e;
    public static final u70 f;
    public static final ul8 g;
    public static final vl8 h;
    public final SparseArray<c> a = new SparseArray<>();
    public final int b;
    public final k95<Integer> c;
    public final k95<Integer> d;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public static ul8 a(q70 q70Var) {
            k95.b bVar = k95.u;
            k95.a aVar = new k95.a();
            vl8 vl8Var = u70.h;
            q95 q95VarD = vl8Var.u;
            if (q95VarD == null) {
                q95VarD = vl8Var.d();
                vl8Var.u = q95VarD;
            }
            w2b it = q95VarD.iterator();
            while (it.hasNext()) {
                Integer num = (Integer) it.next();
                int iIntValue = num.intValue();
                if (Build.VERSION.SDK_INT >= n6b.q(iIntValue) && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(iIntValue).setSampleRate(48000).build(), q70Var.a())) {
                    aVar.c(num);
                }
            }
            aVar.c(2);
            return aVar.g();
        }

        public static int b(int i, int i2, q70 q70Var) {
            for (int i3 = 10; i3 > 0; i3--) {
                int iR = n6b.r(i3);
                if (iR != 0 && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i).setSampleRate(i2).setChannelMask(iR).build(), q70Var.a())) {
                    return i3;
                }
            }
            return 0;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b {
        public static u70 a(AudioManager audioManager, q70 q70Var, k95 k95Var, List list) {
            List<AudioProfile> directProfilesForAttributes = audioManager.getDirectProfilesForAttributes(q70Var.a());
            HashMap map = new HashMap();
            map.put(2, new HashSet(ek5.h1(12)));
            for (int i = 0; i < directProfilesForAttributes.size(); i++) {
                AudioProfile audioProfile = directProfilesForAttributes.get(i);
                if (audioProfile.getEncapsulationType() != 1) {
                    int format = audioProfile.getFormat();
                    if (n6b.J(format) || u70.h.containsKey(Integer.valueOf(format))) {
                        if (map.containsKey(Integer.valueOf(format))) {
                            Set set = (Set) map.get(Integer.valueOf(format));
                            set.getClass();
                            set.addAll(ek5.h1(audioProfile.getChannelMasks()));
                        } else {
                            map.put(Integer.valueOf(format), new HashSet(ek5.h1(audioProfile.getChannelMasks())));
                        }
                    }
                }
            }
            k95.b bVar = k95.u;
            k95.a aVar = new k95.a();
            for (Map.Entry entry : map.entrySet()) {
                aVar.c(new c(((Integer) entry.getKey()).intValue(), (Set<Integer>) entry.getValue()));
            }
            return new u70(aVar.g(), k95Var, list);
        }

        public static AudioDeviceInfo b(AudioManager audioManager, q70 q70Var) {
            audioManager.getClass();
            List<AudioDeviceInfo> audioDevicesForAttributes = audioManager.getAudioDevicesForAttributes(q70Var.a());
            if (audioDevicesForAttributes.isEmpty()) {
                return null;
            }
            return audioDevicesForAttributes.get(0);
        }
    }

    static {
        ul8 ul8VarV = k95.v(12);
        e = ul8VarV;
        f = new u70(k95.v(c.d), ul8VarV, ul8.x);
        Object[] objArr = {2, 5, 6};
        pp0.b(3, objArr);
        g = k95.n(3, objArr);
        m95.a aVar = new m95.a(4);
        aVar.b(5, 6);
        aVar.b(17, 6);
        aVar.b(7, 6);
        aVar.b(30, 10);
        aVar.b(18, 6);
        aVar.b(6, 8);
        aVar.b(8, 8);
        aVar.b(14, 8);
        h = aVar.a(true);
    }

    public u70(ul8 ul8Var, List list, List list2) {
        for (int i = 0; i < ul8Var.w; i++) {
            c cVar = (c) ul8Var.get(i);
            this.a.put(cVar.a, cVar);
        }
        int iMax = 0;
        for (int i2 = 0; i2 < this.a.size(); i2++) {
            iMax = Math.max(iMax, this.a.valueAt(i2).b);
        }
        this.b = iMax;
        this.c = k95.q(list);
        this.d = k95.q(list2);
    }

    public static ul8 a(int[] iArr, int i) {
        k95.b bVar = k95.u;
        k95.a aVar = new k95.a();
        if (iArr == null) {
            iArr = new int[0];
        }
        for (int i2 : iArr) {
            aVar.c(new c(i2, i));
        }
        return aVar.g();
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d1  */
    public static u70 b(Context context, Intent intent, q70 q70Var, AudioDeviceInfo audioDeviceInfo, List<Integer> list) {
        AudioManager audioManagerB = j80.b(context);
        if (audioDeviceInfo == null) {
            audioDeviceInfo = Build.VERSION.SDK_INT >= 33 ? b.b(audioManagerB, q70Var) : null;
        }
        k95 k95VarB = audioDeviceInfo != null ? jx9.b(audioDeviceInfo) : e;
        if (Build.VERSION.SDK_INT >= 33 && (n6b.M(context) || context.getPackageManager().hasSystemFeature("android.hardware.type.automotive"))) {
            return b.a(audioManagerB, q70Var, k95VarB, list);
        }
        for (AudioDeviceInfo audioDeviceInfo2 : audioDeviceInfo == null ? audioManagerB.getDevices(2) : new AudioDeviceInfo[]{audioDeviceInfo}) {
            if (cz2.a(audioDeviceInfo2.getType())) {
                return new u70(k95.v(c.d), k95VarB, list);
            }
        }
        q95.a aVar = new q95.a(4);
        aVar.c(2);
        if (Build.VERSION.SDK_INT >= 29 && (n6b.M(context) || context.getPackageManager().hasSystemFeature("android.hardware.type.automotive"))) {
            ul8 ul8VarA = a.a(q70Var);
            ul8VarA.getClass();
            aVar.d(ul8VarA);
            return new u70(a(ek5.m1(aVar.g()), 10), k95VarB, list);
        }
        ContentResolver contentResolver = context.getContentResolver();
        boolean z = Settings.Global.getInt(contentResolver, "use_external_surround_sound_flag", 0) == 1;
        if (!z) {
            String str = Build.MANUFACTURER;
            if (str.equals("Amazon") || str.equals("Xiaomi")) {
                if (Settings.Global.getInt(contentResolver, "external_surround_sound_enabled", 0) == 1) {
                    ul8 ul8Var = g;
                    ul8Var.getClass();
                    aVar.d(ul8Var);
                }
            }
        } else if (Settings.Global.getInt(contentResolver, "external_surround_sound_enabled", 0) == 1) {
            ul8 ul8Var2 = g;
            ul8Var2.getClass();
            aVar.d(ul8Var2);
        }
        if (intent == null || z || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) != 1) {
            return new u70(a(ek5.m1(aVar.g()), 10), k95VarB, list);
        }
        int[] intArrayExtra = intent.getIntArrayExtra("android.media.extra.ENCODINGS");
        if (intArrayExtra != null) {
            List<Integer> listH1 = ek5.h1(intArrayExtra);
            listH1.getClass();
            aVar.d(listH1);
        }
        return new u70(a(ek5.m1(aVar.g()), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 10)), k95VarB, list);
    }

    /* JADX WARN: Code duplicated, block: B:67:0x00cd  */
    public final Pair c(q70 q70Var, id4 id4Var) {
        String str = id4Var.o;
        str.getClass();
        int iC = fv6.c(str, id4Var.k);
        Integer numValueOf = Integer.valueOf(iC);
        vl8 vl8Var = h;
        if (!vl8Var.containsKey(numValueOf)) {
            return null;
        }
        int i = 6;
        SparseArray<c> sparseArray = this.a;
        if (iC == 18 && !n6b.k(sparseArray, 18)) {
            iC = 6;
        } else if ((iC == 8 && !n6b.k(sparseArray, 8)) || (iC == 30 && !n6b.k(sparseArray, 30))) {
            iC = 7;
        }
        if (!n6b.k(sparseArray, iC)) {
            return null;
        }
        c cVar = sparseArray.get(iC);
        cVar.getClass();
        int iIntValue = cVar.b;
        q95<Integer> q95Var = cVar.c;
        int i2 = id4Var.G;
        boolean zContains = false;
        if (i2 == -1 || iC == 18) {
            int i3 = id4Var.H;
            if (i3 == -1) {
                i3 = 48000;
            }
            int i4 = cVar.a;
            if (q95Var == null) {
                if (Build.VERSION.SDK_INT >= 29) {
                    iIntValue = a.b(i4, i3, q70Var);
                } else {
                    Object obj = vl8Var.get(Integer.valueOf(i4));
                    iIntValue = ((Integer) (obj != null ? obj : 0)).intValue();
                }
            }
            i2 = iIntValue;
        } else if (!id4Var.o.equals("audio/vnd.dts.uhd;profile=p2") || Build.VERSION.SDK_INT >= 33) {
            if (q95Var != null) {
                int iR = n6b.r(i2);
                if (iR != 0) {
                    zContains = q95Var.contains(Integer.valueOf(iR));
                }
            } else if (i2 <= iIntValue) {
                zContains = true;
            }
            if (!zContains) {
                return null;
            }
        } else if (i2 > 10) {
            return null;
        }
        int i5 = Build.VERSION.SDK_INT;
        if (i5 > 28) {
            i = i2;
        } else if (i2 == 7) {
            i = 8;
        } else if (i2 != 3 && i2 != 4 && i2 != 5) {
            i = i2;
        }
        if (i5 <= 26 && "fugu".equals(Build.DEVICE) && i == 1) {
            i = 2;
        }
        int iR2 = n6b.r(i);
        if (iR2 == 0) {
            return null;
        }
        return Pair.create(Integer.valueOf(iC), Integer.valueOf(iR2));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u70)) {
            return false;
        }
        u70 u70Var = (u70) obj;
        return n6b.m(this.a, u70Var.a) && this.b == u70Var.b && Objects.equals(this.c, u70Var.c) && Objects.equals(this.d, u70Var.d);
    }

    public final int hashCode() {
        return Objects.hashCode(this.d) + ((Objects.hashCode(this.c) + ((n6b.n(this.a) + (this.b * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.b + ", audioProfiles=" + this.a + ", speakerLayoutChannelMasks=" + this.c + ", spatializerChannelMasks=" + this.d + "]";
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class c {
        public static final c d;
        public final int a;
        public final int b;
        public final q95<Integer> c;

        static {
            c cVar;
            if (Build.VERSION.SDK_INT >= 33) {
                q95.a aVar = new q95.a(4);
                for (int i = 1; i <= 10; i++) {
                    aVar.c(Integer.valueOf(n6b.r(i)));
                }
                cVar = new c(2, aVar.g());
            } else {
                cVar = new c(2, 10);
            }
            d = cVar;
        }

        public c(int i, Set<Integer> set) {
            this.a = i;
            q95<Integer> q95VarP = q95.p(set);
            this.c = q95VarP;
            w2b it = q95VarP.iterator();
            int iMax = 0;
            while (it.hasNext()) {
                iMax = Math.max(iMax, Integer.bitCount(((Integer) it.next()).intValue()));
            }
            this.b = iMax;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a == cVar.a && this.b == cVar.b && Objects.equals(this.c, cVar.c);
        }

        public final int hashCode() {
            int i = ((this.a * 31) + this.b) * 31;
            q95<Integer> q95Var = this.c;
            return i + (q95Var == null ? 0 : q95Var.hashCode());
        }

        public final String toString() {
            return "AudioProfile[format=" + this.a + ", maxChannelCount=" + this.b + ", channelMasks=" + this.c + "]";
        }

        public c(int i, int i2) {
            this.a = i;
            this.b = i2;
            this.c = null;
        }
    }
}
