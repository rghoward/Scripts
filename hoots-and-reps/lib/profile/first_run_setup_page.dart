import 'package:flutter/material.dart';

import 'athlete_profile_page.dart';

class FirstRunSetupPage extends StatefulWidget {
  const FirstRunSetupPage({required this.initial, super.key});
  final AthleteSettings initial;

  @override
  State<FirstRunSetupPage> createState() => _FirstRunSetupPageState();
}

class _FirstRunSetupPageState extends State<FirstRunSetupPage> {
  var _step = 0;
  late int _minutes = widget.initial.preferredSessionMinutes;
  late final TextEditingController _displayName = TextEditingController(
    text: widget.initial.displayName,
  );
  late final TextEditingController _birthYear = TextEditingController(
    text: widget.initial.birthYear?.toString() ?? '',
  );
  late final TextEditingController _birthMonth = TextEditingController(
    text: widget.initial.birthMonth?.toString() ?? '',
  );
  late final TextEditingController _birthDay = TextEditingController(
    text: widget.initial.birthDay?.toString() ?? '',
  );
  late final Set<String> _equipment = widget.initial.availableEquipment.isEmpty
      ? {...equipmentLabels.keys}
      : {...widget.initial.availableEquipment};
  late final Set<String> _skills = {...widget.initial.skillQualifications};

  AthleteSettings get _settings => AthleteSettings(
    unit: widget.initial.unit,
    personalRecordsLb: widget.initial.personalRecordsLb,
    trainingMaxesLb: widget.initial.trainingMaxesLb,
    movementPreferences: widget.initial.movementPreferences,
    restrictedPatterns: widget.initial.restrictedPatterns,
    reportedInjuries: widget.initial.reportedInjuries,
    availableEquipment: _equipment,
    skillQualifications: _skills,
    trainingDays: widget.initial.trainingDays,
    preferredSessionMinutes: _minutes,
    birthYear: int.tryParse(_birthYear.text.trim()),
    birthMonth: int.tryParse(_birthMonth.text.trim()),
    birthDay: int.tryParse(_birthDay.text.trim()),
    displayName: _displayName.text.trim(),
  );

  @override
  void dispose() {
    _birthYear.dispose();
    _birthMonth.dispose();
    _birthDay.dispose();
    _displayName.dispose();
    super.dispose();
  }

  @override
  Widget build(BuildContext context) => Scaffold(
    backgroundColor: const Color(0xff070615),
    appBar: AppBar(
      backgroundColor: const Color(0xff070615),
      title: const Text('SET UP YOUR QUEST'),
      automaticallyImplyLeading: false,
    ),
    body: SafeArea(
      child: Padding(
        padding: const EdgeInsets.all(20),
        child: Column(
          crossAxisAlignment: CrossAxisAlignment.start,
          children: [
            Text(
              'STEP ${_step + 1} OF 4',
              style: const TextStyle(
                color: Color(0xff56d7ff),
                fontWeight: FontWeight.w900,
              ),
            ),
            const SizedBox(height: 10),
            Expanded(child: _body()),
            Row(
              children: [
                if (_step > 0)
                  TextButton(
                    onPressed: () => setState(() => _step--),
                    child: const Text('BACK'),
                  ),
                const Spacer(),
                FilledButton(
                  onPressed: _step == 3
                      ? () => Navigator.pop(context, _settings)
                      : () => setState(() => _step++),
                  child: Text(_step == 3 ? 'FINISH SETUP' : 'CONTINUE'),
                ),
              ],
            ),
          ],
        ),
      ),
    ),
  );

  Widget _body() => switch (_step) {
    0 => Column(
      crossAxisAlignment: CrossAxisAlignment.start,
      children: [
        const Text(
          'ATHLETE DETAILS',
          style: TextStyle(
            color: Color(0xfff7f5ef),
            fontSize: 25,
            fontWeight: FontWeight.w900,
          ),
        ),
        const SizedBox(height: 8),
        const Text(
          'Tell Hoots what to call you. Your date of birth estimates watch-only heart-rate zones and can be edited later.',
          style: TextStyle(color: Color(0xffada6c1), height: 1.4),
        ),
        const SizedBox(height: 22),
        TextField(
          controller: _displayName,
          textCapitalization: TextCapitalization.words,
          style: const TextStyle(color: Color(0xfff7f5ef)),
          decoration: const InputDecoration(
            labelText: 'Name',
            hintText: 'Example: Rowan',
          ),
        ),
        const SizedBox(height: 16),
        Row(
          children: [
            Expanded(
              child: TextField(
                controller: _birthMonth,
                keyboardType: TextInputType.number,
                style: const TextStyle(color: Color(0xfff7f5ef)),
                decoration: const InputDecoration(labelText: 'Month'),
              ),
            ),
            const SizedBox(width: 8),
            Expanded(
              child: TextField(
                controller: _birthDay,
                keyboardType: TextInputType.number,
                style: const TextStyle(color: Color(0xfff7f5ef)),
                decoration: const InputDecoration(labelText: 'Day'),
              ),
            ),
            const SizedBox(width: 8),
            Expanded(
              flex: 2,
              child: TextField(
                controller: _birthYear,
                keyboardType: TextInputType.number,
                style: const TextStyle(color: Color(0xfff7f5ef)),
                decoration: const InputDecoration(
                  labelText: 'Year',
                  hintText: '1988',
                ),
              ),
            ),
          ],
        ),
      ],
    ),
    1 => Column(
      crossAxisAlignment: CrossAxisAlignment.start,
      children: [
        const Text(
          'TRAINING RHYTHM',
          style: TextStyle(
            color: Color(0xfff7f5ef),
            fontSize: 25,
            fontWeight: FontWeight.w900,
          ),
        ),
        const SizedBox(height: 8),
        const Text(
          'Choose the default view that fits your week. You can change it any time.',
          style: TextStyle(color: Color(0xffada6c1), height: 1.4),
        ),
        const SizedBox(height: 22),
        SegmentedButton<int>(
          segments: const [
            ButtonSegment(value: 60, label: Text('60 MIN')),
            ButtonSegment(value: 90, label: Text('90 MIN')),
          ],
          selected: {_minutes},
          onSelectionChanged: (value) => setState(() => _minutes = value.first),
        ),
      ],
    ),
    2 => _switchList(
      'EQUIPMENT ACCESS',
      'Only enable what you can normally use. Future workouts adapt to this.',
      equipmentLabels,
      _equipment,
    ),
    _ => _switchList(
      'SKILLS & EXPERIENCE',
      'Turn off a skill to receive its reviewed progression instead.',
      {for (final item in skillQualificationDefinitions) item.key: item.label},
      _skills,
    ),
  };

  Widget _switchList(
    String title,
    String description,
    Map<String, String> labels,
    Set<String> selected,
  ) => Column(
    crossAxisAlignment: CrossAxisAlignment.start,
    children: [
      Text(
        title,
        style: const TextStyle(
          color: Color(0xfff7f5ef),
          fontSize: 25,
          fontWeight: FontWeight.w900,
        ),
      ),
      const SizedBox(height: 8),
      Text(
        description,
        style: const TextStyle(color: Color(0xffada6c1), height: 1.4),
      ),
      const SizedBox(height: 16),
      Expanded(
        child: ListView(
          children: labels.entries
              .map(
                (entry) => SwitchListTile(
                  contentPadding: EdgeInsets.zero,
                  title: Text(
                    entry.value,
                    style: const TextStyle(color: Color(0xfff7f5ef)),
                  ),
                  value: selected.contains(entry.key),
                  onChanged: (value) => setState(
                    () => value
                        ? selected.add(entry.key)
                        : selected.remove(entry.key),
                  ),
                ),
              )
              .toList(),
        ),
      ),
    ],
  );
}
