package defpackage;

import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.ContentObserver;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class w70 {
    public final Context a;
    public final ba0 b;
    public final Handler c;
    public final a d;
    public final c e;
    public final b f;
    public ix9 g;
    public u70 h;
    public AudioDeviceInfo i;
    public q70 j;
    public boolean k;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public final class a extends AudioDeviceCallback {
        public a() {
        }

        @Override // android.media.AudioDeviceCallback
        public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
            w70.this.c();
        }

        @Override // android.media.AudioDeviceCallback
        public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
            w70 w70Var = w70.this;
            if (n6b.l(w70Var.i, audioDeviceInfoArr)) {
                w70Var.i = null;
            }
            w70Var.c();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public final class b extends ContentObserver {
        public final ContentResolver a;
        public final Uri b;

        public b(Handler handler, ContentResolver contentResolver, Uri uri) {
            super(handler);
            this.a = contentResolver;
            this.b = uri;
        }

        @Override // android.database.ContentObserver
        public final void onChange(boolean z) {
            w70.this.c();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public final class c extends BroadcastReceiver {
        public c() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (isInitialStickyBroadcast()) {
                return;
            }
            w70 w70Var = w70.this;
            w70Var.b(u70.b(context, intent, w70Var.j, w70Var.i, w70Var.a()));
        }
    }

    public w70(Context context, ba0 ba0Var, q70 q70Var, AudioDeviceInfo audioDeviceInfo) {
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.b = ba0Var;
        this.j = q70Var;
        this.i = audioDeviceInfo;
        String str = n6b.a;
        Looper looperMyLooper = Looper.myLooper();
        Handler handler = new Handler(looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper, null);
        this.c = handler;
        this.d = new a();
        this.e = new c();
        ul8 ul8Var = u70.e;
        String str2 = Build.MANUFACTURER;
        Uri uriFor = (str2.equals("Amazon") || str2.equals("Xiaomi")) ? Settings.Global.getUriFor("external_surround_sound_enabled") : null;
        this.f = uriFor != null ? new b(handler, applicationContext.getContentResolver(), uriFor) : null;
    }

    public final List<Integer> a() {
        ix9 ix9Var;
        if (Build.VERSION.SDK_INT >= 32 && (ix9Var = this.g) != null) {
            return ix9Var.b();
        }
        k95.b bVar = k95.u;
        return ul8.x;
    }

    public final void b(u70 u70Var) {
        if (!this.k || u70Var.equals(this.h)) {
            return;
        }
        this.h = u70Var;
        da0 da0Var = (da0) this.b.a;
        da0Var.h();
        u70 u70Var2 = da0Var.h;
        if (u70Var2 == null || u70Var.equals(u70Var2)) {
            return;
        }
        da0Var.h = u70Var;
        gb6<m80.e> gb6Var = da0Var.f;
        if (gb6Var != null) {
            gb6Var.e(-1, new ca0());
        }
    }

    public final void c() {
        List<Integer> listA = a();
        q70 q70Var = this.j;
        AudioDeviceInfo audioDeviceInfo = this.i;
        ul8 ul8Var = u70.e;
        IntentFilter intentFilter = new IntentFilter("android.media.action.HDMI_AUDIO_PLUG");
        Context context = this.a;
        b(u70.b(context, context.registerReceiver(null, intentFilter), q70Var, audioDeviceInfo, listA));
    }
}
