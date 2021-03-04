local TestPipeline() = {
  kind: 'pipeline',
  name: 'test',
  steps: [
    {
      name: 'lint',
      image: 'debian:buster-20210208',
      commands: [
        'echo "hello, i am here, linting"',
      ],
    },
    {
      name: 'test',
      image: 'debian:buster-20210208',
      commands: [
        'echo "hello, i am here, testing"',
      ],
      depends_on: ['lint'],
    },
  ],
};

// Pipelines
[
  TestPipeline(),
]