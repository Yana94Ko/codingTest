class Queue {
  constructor() {
    this.elements = [];
  }

  enqueue(element) {
    this.elements.push(element);
  }

  dequeue() {
    return this.elements.shift();
  }

  front() {
    return this.elements[0];
  }

  isEmpty() {
    return this.elements.length === 0;
  }

  size() {
    return this.elements.length;
  }
}
function solution(priorities, location) {
    const queue = new Queue();

  // 초기 큐에 프로세스와 위치 정보를 저장
  for (let i = 0; i < priorities.length; i++) {
    queue.enqueue({ priority: priorities[i], location: i });
  }

  let order = 0;

  while (!queue.isEmpty()) {
    const currentProcess = queue.dequeue();

    // 현재 프로세스의 우선순위보다 높은 프로세스가 있는지 확인
    const hasHigherPriority = queue.elements.some(
      process => process.priority > currentProcess.priority
    );

    if (hasHigherPriority) {
      queue.enqueue(currentProcess); // 우선순위가 더 높은 프로세스가 있다면 다시 큐에 넣음
    } else {
      order++;

      // 찾고자 하는 프로세스인 경우 순서 반환됨
      if (currentProcess.location === location) {
        return order;
      }
    }
  }
}