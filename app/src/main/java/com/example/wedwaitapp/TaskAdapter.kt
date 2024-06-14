import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.EditText
import android.widget.ImageButton
import androidx.recyclerview.widget.RecyclerView
import com.example.wedwaitapp.R
import com.example.wedwaitapp.Task

class TaskAdapter(private val tasks: MutableList<Task>) : RecyclerView.Adapter<TaskAdapter.TaskViewHolder>() {

    inner class TaskViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val taskCheckBox: CheckBox = itemView.findViewById(R.id.taskCheckBox)
        val taskEditText: EditText = itemView.findViewById(R.id.taskEditText)
        val deleteButton: ImageButton = itemView.findViewById(R.id.deleteButton)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_task, parent, false)
        return TaskViewHolder(view)
    }

    override fun onBindViewHolder(holder: TaskViewHolder, position: Int) {
        val task = tasks[position]
        holder.taskCheckBox.isChecked = task.isCompleted
        holder.taskEditText.setText(task.title)


        holder.taskCheckBox.setOnCheckedChangeListener { _, isChecked ->
            task.isCompleted = isChecked
        }


        holder.taskEditText.setOnFocusChangeListener { _, hasFocus ->
            if (!hasFocus) {
                task.title = holder.taskEditText.text.toString()
            }
        }


        holder.deleteButton.setOnClickListener {
            tasks.removeAt(position)
            notifyItemRemoved(position)
            notifyItemRangeChanged(position, tasks.size)
        }
    }

    override fun getItemCount(): Int = tasks.size
}
